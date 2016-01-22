package com.genebook.auth;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("classpath*:conf/spring-*.xml");
		ctx.start();
		System.out.println(ctx);
		 try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
