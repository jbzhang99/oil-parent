package com.oil.av.web.api.service;

import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.oil.framework.common.util.StringUtils;
import com.oil.framework.common.util.WxSignUtil;

@Service
public class TokenUtilsService {
    private static final Log logger = LogFactory.getLog(TokenUtilsService.class);
    
    private static final String TOKEN_KEY = "token_key";
    //@Resource
    //private RedisTemplate    apiRedisTemplate;
    
    //@Resource
    //private ErrorMsgService errorMsgServiceImpl;        //日志记录

    public static String createToken(String memberId,String version,String ip,
    		String deviceCode,String device){
    	SortedMap<Object,Object> map = new TreeMap<Object, Object>();
    	map.put("memberId", memberId);
    	map.put("version", version);
    	map.put("ip", ip);
    	map.put("deviceCode", deviceCode);
    	map.put("device", device);
    	
    	return getToken(map);
    }
    public static String getToken(SortedMap<Object,Object> map) {
    	return WxSignUtil.createSign(map, TOKEN_KEY);
    }

    /**
     * 验证token
     * @param userId
     * @param token
     * @param version
     * @param url
     * @return
     */
    public boolean checkToken(String userToken, String token, String serial, String userId) {
        //缓存获取 TODO token(String) apiRedisTemplate.opsForValue().get(KeysUtils.Token.getUserTokenKey(userId.toString()));
        if (StringUtils.isNotEmpty(token) && token.equals(userToken)) {
            return true;
        } else {
            return false;
        }
    }
    /*public void insertErrorlog(WebApplicationContext wac,Long userId, String token,String version,String url){
        logger.info("token验证失败  传入参数为====》userId："+userId+"====token:"+token+"====version:"+version+"====url:"+url);
        //插入错误记录
        ErrorMsgVo errorMsgVo = new ErrorMsgVo();
        errorMsgVo.setId(UUIDS.getUUID());
        errorMsgVo.setErrorCode(url);
        errorMsgVo.setErrorMsgErrorTypeEnum(ErrorMsgErrorTypeEnum.BUS);
        errorMsgVo.setUserId(userId);
        errorMsgVo.setVersions(version+" ");
        errorMsgVo.setDeviceType("APP");
        errorMsgVo.setErrorMsgDeviceEnum(ErrorMsgDeviceEnum.ANDROID);
        errorMsgVo.setLiveId("");
        errorMsgVo.setErrorMsg("接口传入参数为====》userId："+userId+"====token:"+token+"====version:"+version+"====url:"+url);      
        errorMsgServiceImpl = (ErrorMsgService)wac.getBean("errorMsgServiceImpl");
        errorMsgServiceImpl.addErrorMsgVo(errorMsgVo);
    }*/
}
