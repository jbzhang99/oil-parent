package com.oil.av.service.impl.platform.member;

import org.springframework.stereotype.Service;

import com.oil.av.service.platform.member.AccountService;
import com.oil.framework.common.exception.BusinessException;

@Service
public class AccountServiceImpl implements AccountService{

	@Override
	public void userSign(String userName, String pwd) throws BusinessException {
			if("zhangsan".equals(userName) && "123456".equals(pwd)){
				System.out.println("登陆成功");
			}else{
				throw new BusinessException("1001");
			}
	}

}
