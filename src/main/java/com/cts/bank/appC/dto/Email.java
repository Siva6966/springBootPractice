package com.cts.bank.appC.dto;

import org.springframework.stereotype.Component;

@Component("email")
public class Email implements NotificationSender {

	public void sendNotification (String message) {
		System.out.println("Email Notification " + message);
	}
}
