package com.cain.service.impl;

import com.cain.dao.AccountDao;
import com.cain.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		// TODO Auto-generated method stub
		accountDao.out(outer, money);
		 int i = 1/0;
		accountDao.in(inner, money);
	}

}
