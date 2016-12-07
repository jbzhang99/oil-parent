package com.oil.av.web.api.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oil.framework.common.exception.BusinessException;

/**
 * @Description: 过滤器处理非法字符
 *
 * @Version：1.0
 * @author lv  
 * @date 2016年12月6日  
 *
 */
public class IllegalCharacterFilter implements Filter{

	private String errorPage;//跳转的错误信息页面  
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//读取错误信息提示页面路径  
        errorPage = filterConfig.getInitParameter("errorPage");  
        if(null==errorPage || "".equals(errorPage)){  
            throw new RuntimeException("没有配置错误信息跳转页面,请再web.xml中进行配置\n<init-param>\n<param-name>errorPage</param-name>\n<param-value>/error.jsp</param-value>\n </init-param>\n路径可以是你自己设定的任何有效路径页面！！");  
            //System.out.println("没有配置错误信息跳转页面");  
        }  
	}

	/**
	 * 非法字符过滤器，用来处理request.getParamater中的非法字符。如<script>alert('123');</script>
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		request = new MHttpServletRequest(request);
		HttpServletResponse response = (HttpServletResponse)res;
		
		//解决跨域访问
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        try {
        	chain.doFilter(request, response);
		} catch (Exception e) {
			if(e instanceof BusinessException){//如果是你定义的业务异常  
                request.setAttribute("BsException", e);//存储业务异常信息类  
                request.getRequestDispatcher(errorPage).forward(request, response);//跳转到信息提示页面！！  
            }  
            e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		
	}

}
