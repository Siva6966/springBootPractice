package com.cts.bank.appC.service;
import com.cts.bank.appC.model.Account;

public interface AccountService {

	public void deposit(Account account, double amount);
	
	public void withdraw(Account account, double amount);
	
	public double getBalance(Account accunt);
}
