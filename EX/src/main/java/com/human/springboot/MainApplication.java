package com.human.springboot;

import java.util.Properties;

public class MainApplication {

	public static void main(String[] args) {
		final String user = "wwwzara2305@gmail.com"; //�߽����� �̸��� ���̵� �Է�
		final String password = "abzwymbgjvmojubp";         //�߽��� �̸����� �н����带 �Է�
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com"); 
		prop.put("mail.smtp.port", 465); 
		prop.put("mail.smtp.auth", "true"); 
		prop.put("mail.smtp.ssl.enable", "true"); 
		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		
    

	}

}
