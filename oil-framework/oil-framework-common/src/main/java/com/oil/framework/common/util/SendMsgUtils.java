/*
 * 
 * 
 * 
 */
package com.oil.framework.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * 
 */
public final class SendMsgUtils {

	//private static final Logger log = Logger.getLogger(SendMsgUtils.class);
	/**
	 * 不可实例化
	 */
	private SendMsgUtils() {
	}

	/**
	 * 发送短信
	 * @param target
	 * @param code
	 * @param sn
	 * @return
	 */
	public static boolean sendSms(String target, String content) {
		Map<String, String> map = new HashMap<>();
		
		map.put("account", "AA00285");
		map.put("password", Md5Util.string2MD5("ZMJL_HXKJ*pwd@2016").toUpperCase());
		
		map.put("mobile", target);
		map.put("content", content);
		map.put("action", "send");
		String body = HttpClientUtil.getInstance().sendHttpPost("http://dx.ipyy.net/sms.aspx", map);
		
		if (StringUtils.indexOf(body, "<returnstatus>Success</returnstatus>") > -1) {
			return true;
		}
		return false;
	}
	
}