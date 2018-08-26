package com.music.Team.util;



import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public   class  SendEmailUtil {
	//设置是谁发的邮件
	public static String MyEmail="13657378611@163.com";
	
	//设置授权密码
	public static String MyEmailPwd="aa123456";
	
	//设置服务器
	public static String MyEmailHost="smtp.163.com";
	
	private static  String code;
	
	
	//弹出框
	

	//发送邮件
	public static void  sendMail(String receiveMail) {
		//1，随即产生验证码
		Random r=new Random();
		StringBuffer sbf=new StringBuffer();
		int count=0;
		while(count<6){
			sbf.append(r.nextInt(10));
			count++;
		}
		setCode(sbf.toString());
		try {
			//2，创建配置项
			Properties props=new Properties();
			props.setProperty("mail.transport.protocol","smtp");  //协议
			props.setProperty("mail.smtp.host",MyEmailHost);		//设置服务器
			props.setProperty("mail.smtp.auth","true");			//授权给服务器，可以发送邮件
			props.put("mail.smtp.localhost", "mail.digu.com");
			
			//3.开始创建邮件信息
			Session session=Session.getInstance(props);
			session.setDebug(false);
			MimeMessage message=new MimeMessage(session);
			//邮件从哪来
			message.setFrom(new InternetAddress(MyEmail,"Musik","UTF-8"));
			//邮件发送给谁？
			message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail,"用户","UTF-8"));
			//设置主题
			message.setSubject("欢迎注册Musik");
			//设置内容
			message.setContent("您好您的验证码为:"+sbf.toString(),"text/html;charset=UTF-8");
			//设置发送时间
			message.setSentDate(new Date());
			message.saveChanges();
			//发送邮件
			Transport transport=session.getTransport();
			transport.connect(MyEmail,MyEmailPwd);
			transport.sendMessage(message,message.getAllRecipients());
			transport.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}


	public static String getCode() {
		return code;
	}


	public static void setCode(String code) {
		SendEmailUtil.code = code;
	}
}