package com.oil.av.web.api.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.oil.av.web.api.service.TokenUtilsService;

public class APIHandlerInterceptor implements HandlerInterceptor {
    private static Log log = LogFactory.getLog(APIHandlerInterceptor.class);
    private Long       startTime;
    private Long       endTime;

    @Resource
    private TokenUtilsService tokenUtilsService;
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse arg1, Object arg2,
                                Exception arg3) throws Exception {
        //        endTime = System.currentTimeMillis();
        //        try {
        //            // 获取sessionID
        //            String ip = this.getIpAddr(request);
        //            // 获取登录用户
        //            CustomModel user = LoginUserUtils.getLoginUser();
        //            // 获取请求地址
        //            String URI = request.getRequestURI();
        //            log.info("[ ACTION ] [ USERNAME:" + user.getName() + " ] " + "[ IP:" + ip + " ] "
        //                     + "[ URI:" + URI + " ]" + " [ TIME:" + (endTime - startTime) + "ms ]");
        //        } catch (Exception e) {
        //            // TODO
        //        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj,
                           ModelAndView model) throws Exception {
    }

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, 
    		Object arg2) throws Exception {
    	String reqIp = getIpAddr(req);
    	
    	String memberId = req.getParameter("memberId");
 	   	String token = req.getParameter("token");
 	   	String version = req.getParameter("version");
 	   	String deviceCode = req.getParameter("deviceCode");
 	   	String device = req.getParameter("device");
 	   	String serial = req.getParameter("serial");
 	   	
 	    req.getParameterMap().put("ip", new String[]{reqIp});
 	   	if(StringUtils.isNotBlank(memberId)){
 		   //验证用户token
 	   		String userToken = TokenUtilsService.createToken(memberId, version, reqIp, deviceCode, device);
 	   		if(tokenUtilsService.checkToken(token, userToken, serial, memberId)){
 	   			return true;
 	   		}else{
 	   			//token校验不通过
 	   			res.setStatus(401);
 	   			return false;
 	   		}
 	   	}else{
           res.setStatus(400);
           return false;
 	   	}
    }

    /**
     * 获取客户端真实IP
     * 
     * @param request
     * @return
     */
    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("http_client_ip");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        // 如果是多级代理
        if (ip != null && ip.indexOf(",") != -1) {
            ip = ip.substring(ip.lastIndexOf(",") + 1, ip.length()).trim();
        }
        return ip;
    }

}
