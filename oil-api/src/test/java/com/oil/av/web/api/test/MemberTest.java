package com.oil.av.web.api.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Maps;
import com.oil.av.dao.platform.config.SmsTemplateDao;
import com.oil.av.dao.platform.member.MemberDao;
import com.oil.av.em.MemberStateEnum;
import com.oil.av.em.SmsTemplateNameEnum;
import com.oil.av.service.platform.config.ConfigCompanyService;
import com.oil.av.service.platform.member.MemberService;
import com.oil.av.vo.platform.member.MemberVo;
import com.oil.av.web.api.model.request.member.AutoSignRequest;
import com.oil.av.web.api.model.request.member.RegisterRequest;
import com.oil.av.web.api.model.response.member.MemberSignResponse;
import com.oil.av.web.api.service.member.SingService;
import com.oil.framework.common.exception.BusinessException;
import com.oil.framework.common.util.PasswordUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/spring-context.xml"})
public class MemberTest {
	
	@Resource
    SingService singService;
	
	@Resource
	public ConfigCompanyService configCompanyService;
	
	
	@Resource
	private SmsTemplateDao smTemplateDao;
	
	@Resource
	private MemberDao memberDao;
	
	@Resource
    private MemberService memberService;
	
	/*@Test
	public void test1(){
		ConfigCompanyVo vo=configCompanyService.getConfigCompanyVoById("1");
		System.out.println(vo.getAddress());
	}*/
	
	//@Test
	public void testAddUser(){
		RegisterRequest register = new RegisterRequest();
		register.setTel("1531142432");
		register.setPwd("123456");
		register.setIp("127.0.0.1");
		register.setDevice("pc");
		register.setDeviceCode("lv-pc");
		register.setVersion("1.0");
		register.setNickName("testNick");
		try {
			MemberSignResponse usr = singService.registerMember(register);
			System.out.println("id==="+usr.getMemberId());
		} catch (BusinessException e) {
			System.out.println(e.getCode());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testAutoLogin(){
		AutoSignRequest asr = new AutoSignRequest();
		asr.setMemberId("31F9D434A26E4C2EBD13945FA1E4F2DB");
		asr.setSerialNumber("e23b2d9f77ce2a9ce02e6461ed553e34");
		try {
			MemberSignResponse usr = singService.autoLoginBySerial(asr);
			System.out.println("token==="+usr.getToken());
		} catch (BusinessException e) {
			System.out.println(e.getCode());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testUpdateUser(){
		/*	测试通过
		 * Map<String,Object> map = Maps.newHashMap();
		map.put("id", "FC6A689513B64C3A912436C3A4D256D8");
		map.put("nick", "01010101");
		map.put("last_ip", "127.0.0.1");
		map.put("last_device", "01010101");
		map.put("last_device_serial", null);
		memberDao.updateMemberByMap(map);*/
		
		MemberVo memberUpdate = new MemberVo();
		memberUpdate.setId("78435487B068432C92C360F8AF09C935");
		memberUpdate.setWrongTimes(5);
		memberUpdate.setWrongDate(new Date());
		//TODO 获取系统配置,密码错误次数,锁定用户
			memberUpdate.setMemberStateEnum(MemberStateEnum.DESTROY);
		memberService.updateNotNull(memberUpdate);
		
	}
	
	public static void main(String[] args) {
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis()-new Date().getTime());*/
		
		System.out.println(PasswordUtils.cryptPassword("00000000000", "000000"));
	}
}
