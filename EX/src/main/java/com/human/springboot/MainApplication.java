package com.human.springboot;

import java.util.Properties;

public class MainApplication {

	public static void main(String[] args) {
		final String user = "wwwzara2305@gmail.com"; //발신자의 이메일 아이디를 입력
		final String password = "abzwymbgjvmojubp";         //발신자 이메일의 패스워드를 입력
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com"); 
		prop.put("mail.smtp.port", 465); 
		prop.put("mail.smtp.auth", "true"); 
		prop.put("mail.smtp.ssl.enable", "true"); 
		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		
    

	}

}
