package com.oil.av.web.api.test;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Maps;
import com.oil.av.dao.platform.member.MemberDao;
import com.oil.av.service.platform.config.ConfigCompanyService;
import com.oil.av.web.api.service.member.SingService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/spring-context.xml"})
public class MemberTest {
	
	@Resource
    SingService singService;
	
	@Resource
	public ConfigCompanyService configCompanyService;
	
	
	@Resource
	private MemberDao memberDao;
	
	/*@Test
	public void test1(){
		ConfigCompanyVo vo=configCompanyService.getConfigCompanyVoById("1");
		System.out.println(vo.getAddress());
	}*/
	/*@Test
	public void testAddUser(){
		RegisterRequest register = new RegisterRequest();
		register.setTel("1531142430");
		register.setPwd("123456");
		register.setIp("127.0.0.1");
		register.setDevice("pc");
		register.setDeviceCode("lv-pc");
		register.setVersion("1.0");
		register.setNickName("testNick");
		try {
			UserSignResponse usr = singService.registerUser(register);
			System.out.println("id==="+usr.getUserId());
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}*/
	
	/*@Test
	public void testAutoLogin(){
		AutoSignRequest asr = new AutoSignRequest();
		asr.setUserId("31F9D434A26E4C2EBD13945FA1E4F2DB");
		asr.setSerialNumber("e23b2d9f77ce2a9ce02e6461ed553e34");
		try {
			UserSignResponse usr = singService.autoLoginBySerial(asr);
			System.out.println("token==="+usr.getToken());
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}*/
	
	@Test
	public void testUpdateUser(){
		Map<String,Object> map = Maps.newHashMap();
		map.put("id", "31F9D434A26E4C2EBD13945FA1E4F2DB");
		map.put("nick", "111235");
		memberDao.updateMember(map);
	}
}
