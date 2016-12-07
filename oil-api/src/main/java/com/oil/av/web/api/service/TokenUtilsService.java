package com.oil.av.web.api.service;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.io.Charsets;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.google.common.hash.Hashing;
import com.oil.av.service.api.user.UserService;
import com.oil.av.vo.api.user.UserVo;
import com.oil.framework.common.util.DateUtils;
import com.oil.framework.common.util.StringUtils;

@Service
public class TokenUtilsService {
    private static final Log logger = LogFactory.getLog(TokenUtilsService.class);
    
    @Resource
    private UserService userService;                                     //账号服务
    
    //@Resource
    //private RedisTemplate    apiRedisTemplate;
    
    //@Resource
    //private ErrorMsgService errorMsgServiceImpl;        //日志记录

    public static String getToken(String password, String userId, String date) {
        return Hashing.md5().newHasher()
        		.putString(StringUtils.getNotEmptyStr(password), Charsets.UTF_8)
        		.putString(StringUtils.getNotEmptyStr(userId), Charsets.UTF_8)
        		.putString(date, Charsets.UTF_8).hash().toString();
    }

    public static String getToken(String password, Long userId, Date date) {
        return getToken(password, StringUtils.getNotEmptyStr(userId), DateUtils.formatDateTime(date, "yyyyMMddHHmmss"));
    }

    /**
     * 验证token
     * @param userId
     * @param token
     * @param version
     * @param url
     * @return
     */
    public Boolean checkToken(WebApplicationContext wac,String userId, String token,String version,String url) {
        String userToken = "";
        //缓存获取token(String) apiRedisTemplate.opsForValue().get(KeysUtils.Token.getUserTokenKey(userId.toString()));
        if (StringUtils.isEmpty(userToken)) {
            logger.info("缓存的用户token过期，用户ID为：" + userId);
            //查询数据库数据
            UserVo userVo = userService.getUserVoById(userId);
            if(userVo != null){
                userToken = userVo.getLastToken();                
            }else{
                userToken="";
            }
        }
        
        if (StringUtils.isNotEmpty(token) && token.equals(userToken)) {
            return true;
        } else {
            //insertErrorlog(wac,userId, userToken, version, url);
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
