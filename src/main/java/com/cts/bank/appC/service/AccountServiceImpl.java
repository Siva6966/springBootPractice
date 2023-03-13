package com.cts.bank.appC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.bank.appC.dto.Email;
import com.cts.bank.appC.dto.NotificationSender;
import com.cts.bank.appC.dto.SMS;
import com.cts.bank.appC.model.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	@Qualifier("SMS")
	private NotificationSender sms;

	@Autowired
	@Qualifier("email")
	private NotificationSender email;

	@Override
	public void deposit(Account account, double amount) {
		if (amount > 0) {
			double balance = account.getBalance();
			account.setBalance(balance + amount);
			sms.sendNotification("Deposited " + amount + " into account " + account.getAccountNumber());
			email.sendNotification("Deposited " + amount + " into account " + account.getAccountNumber());
		} else {
			System.out.println("Please enter more than 0");
		}
	}

	@Override
	public void withdraw(Account account, double amount) {
		if (amount > 0) {
			double balance = account.getBalance();
			account.setBalance(balance - amount);
			sms.sendNotification("Withdrawn " + amount + " into account " + account.getAccountNumber());
			email.sendNotification("Withdrawn " + amount + " into account " + account.getAccountNumber());
		} else {
			System.out.println("Please enter more than 0");
		}
	}

	@Override
	public double getBalance(Account account) {
		sms.sendNotification(
				"Balance for this Account number " + account.getAccountNumber() + " is " + account.getBalance());
		email.sendNotification(
				"Balance for this Account number " + account.getAccountNumber() + " is " + account.getBalance());
		return account.getBalance();
	}

}
