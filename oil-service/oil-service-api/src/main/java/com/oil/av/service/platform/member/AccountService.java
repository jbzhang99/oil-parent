package com.oil.av.service.platform.member;

import com.oil.framework.common.exception.BusinessException;

public interface AccountService {

	public void userSign(String userName,String pwd) throws BusinessException;
}
