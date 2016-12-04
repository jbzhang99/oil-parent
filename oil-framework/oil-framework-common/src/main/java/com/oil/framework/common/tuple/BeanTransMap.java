package com.oil.framework.common.tuple;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**Bean，MAP 转换工具
 * @Version: 1.0
 * @ProjectName:aikxian-framework-common
 * @Filename:  BeanTransMap.java
 * @PackageName: com.aikxian.framework.common.tuple
 * @Author: songchunlong 宋春龙
 * @Email: songchunlong@aikxian.com
 * @Date:2016年5月4日上午12:04:17
 * @Copyright (c) 2016, dev@aikxian.com.com All Rights Reserved.
 */
public class BeanTransMap {
				private static Log logger = LogFactory.getLog(BeanTransMap.class);

				// Map --> Bean 2: 利用org.apache.commons.beanutils 工具类实现 Map --> Bean  
				public static void transMap2Bean2(Map<String, Object> map, Object obj) {
								if (map == null || obj == null) {
												return;
								}
								try {
												org.apache.commons.beanutils.BeanUtils.populate(obj, map);
								} catch (Exception e) {
												logger.info("transMap2Bean2 Error " + e);
								}
				}

				// Map --> Bean 1: 利用Introspector,PropertyDescriptor实现 Map --> Bean  
				public static void transMap2Bean(Map<String, Object> map, Object obj) {
								try {
												BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
												PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
												for (PropertyDescriptor property : propertyDescriptors) {
																String key = property.getName();
																if (map.containsKey(key)) {
																				Object value = map.get(key);
																				// 得到property对应的setter方法  
																				Method setter = property.getWriteMethod();
																				setter.invoke(obj, value);
																}
												}
								} catch (Exception e) {
												logger.info("transMap2Bean Error " + e);
								}
								return;
				}

				// Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map  
				public static Map<String, Object> transBean2Map(Object obj) {
								if (obj == null) {
												return null;
								}
								Map<String, Object> map = new HashMap<String, Object>();
								try {
												BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
												PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
												for (PropertyDescriptor property : propertyDescriptors) {
																String key = property.getName();
																// 过滤class属性  
																if (!key.equals("class")) {
																				// 得到property对应的getter方法  
																				Method getter = property.getReadMethod();
																				Object value = getter.invoke(obj);
																				if (value != null)
																								map.put(key, value);
																}
												}
								} catch (Exception e) {
												logger.error("transBean2Map Error " + e);
								}
								return map;
				}
}
