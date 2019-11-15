package com.Qulifierannotation.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test123 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansQulifier.xml"); 
		Library l1=(Library)context.getBean("Lib");
		
		l1.show_id();
		l1.show_name();
		 
	}

}
