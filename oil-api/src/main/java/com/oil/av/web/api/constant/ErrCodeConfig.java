package com.oil.av.web.api.constant;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.springframework.util.StringUtils;

import com.oil.framework.common.base.model.Result;
public class ErrCodeConfig {
//	  static Logger logger = Logger.getLogger(ErrCodeConfig.class);
	/**
	 * 错误码集合
	 */
	public static Map<String,String> ERROR_CODE_MAP = new HashMap<String,String>();
	
	/**
	 * 非法请求参数错误码
	 */
	public static String CODE_ILLPARAMERROR ="SE1000";
	/**
	 * 系统异常错误码
	 */
	public static String CODE_EXCEPTION ="SE1001";
	/**
	 * 请求超时
	 */
	public static String CODE_TIMEDOUT="SE1002";
	

	/**
     * 注入错误信息
     *
     * @param result    返回结果
     * @param errorCode api错误码
     * @param <T>       result的子类
     * @return result的子类
     */
    public static <T extends Result> T injectError(T result, String errorCode) {
        result.setCode(errorCode);
        result.setErrorDescription(getErrorMesByCode(errorCode));
        return result;
    }
    
    /**
     * 根据错误码返回错误描述
     *
     * @param ErrorCode 错误码
     * @return 错误描述 或 未知错误 当获取不到错误描述的时候，返回未知错误
     */
    public static String getErrorMesByCode(String ErrorCode) {
        String errorMsg = ERROR_CODE_MAP.get(ErrorCode);
        return StringUtils.isEmpty(errorMsg) ? "未知错误" : errorMsg;
    }
    
    /**
     * 该类的初始化方法 从数据库加载信息
     */
    public static void init(Connection conn) throws IOException, SQLException {

//        logger.info("从数据库加载errorCodeMap信息");
        loadErrorTips(conn);
//        logger.info("从数据库加载errorCodeMap信息完毕");
    }
    
    public static void loadErrorTips(Connection conn) throws SQLException,IOException {
		QueryRunner qRunner = new QueryRunner();
		List<Map<String, Object>> list = qRunner.query(conn, "select * from sys_error_code_t", new MapListHandler());
		for (Map<String, Object> stringObjectMap : list) {
		    ERROR_CODE_MAP.put(String.valueOf(stringObjectMap.get("code")), String.valueOf(stringObjectMap.get("msg")));
		}
	}
}
