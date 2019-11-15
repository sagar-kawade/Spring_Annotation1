package com.Autowiredannotaion.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test222 {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("BeansAuto.xml");

Services s1=(Services)context.getBean("service");
s1.clientmethod();
	}

}
