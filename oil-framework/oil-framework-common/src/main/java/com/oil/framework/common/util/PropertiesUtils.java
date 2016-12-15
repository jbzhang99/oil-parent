package com.oil.framework.common.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesUtils {

	/**
	 * 获取Properties
	 * @param propertyName 相对路径
	 * @return
	 */
	public static Properties getPropertyFile(String propertyName){  
	    Properties props=new Properties();  
	    try {  
	        props=PropertiesLoaderUtils.loadAllProperties(propertyName);   
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	    return props;  
	}  
	
	public static void main(String[] args) {
		Properties props = getPropertyFile("properties/test.properties");
		System.out.println(props.getProperty("test"));
	}
}
