package com.cts.bank.appC.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.bank.appC.model.Account;
import com.cts.bank.appC.service.AccountService;

@Component
public class Demo {

	@Autowired
	private AccountService impl;

	public void processRequest() {
		 Account account = new Account();
		account.setId(1001);
		account.setAccountNumber("CTS218CVA");

		impl.deposit(account, 10000);
		impl.withdraw(account, 5000);
		impl.getBalance(account);
	}

}
