package com.oil.av.web.api.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import com.oil.av.web.api.utils.XssShieldUtil;

/**
 * @Description: 过滤请求参数和参数值
 *
 * @Version：1.0
 * @author lv  
 * @date 2016年12月6日  
 *
 */
public class MHttpServletRequest extends HttpServletRequestWrapper{

	public MHttpServletRequest(HttpServletRequest request) {
		super(request);
	}

	@Override
    public String getParameter(String name) {
        // 返回值之前 先进行过滤
        return XssShieldUtil.stripXss(super.getParameter(name));
    }

    @Override
    public String[] getParameterValues(String name) {
        // 返回值之前 先进行过滤
        String[] values = super.getParameterValues(name);
        if(values != null){
            for (int i = 0; i < values.length; i++) {
                values[i] = XssShieldUtil.stripXss(values[i]);
            }
        }
        return values;
    }
    
}
