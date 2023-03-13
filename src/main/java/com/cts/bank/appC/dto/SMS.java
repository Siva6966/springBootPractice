package com.cts.bank.appC.dto;

import org.springframework.stereotype.Component;

@Component("SMS")
public class SMS implements NotificationSender {

	public void sendNotification (String message) {
		System.out.println("SMS Notification " + message);
	}
}
