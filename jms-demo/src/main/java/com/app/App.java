package com.app;

import com.mail.GEmailSender;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GEmailSender geMailSender = new GEmailSender();
		String to = "recipientemail@gmail.com";
		String from = "youremail@gmail.com";
		String subject = "Test Subject";
		String text = "Test Test";
		boolean flag = geMailSender.sendEmail(to, from, subject, text);
		if(flag) {
			System.out.println("Email sent");
		} else {
			System.out.println("error");
		}
	}

}
