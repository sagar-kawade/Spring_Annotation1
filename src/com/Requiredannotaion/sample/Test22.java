package com.Requiredannotaion.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test22 {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("BeansRE.xml");

Shop_data sd1=(Shop_data)context.getBean("shop");

System.out.println("shop_name"+sd1.getS_name());

System.out.println("shop_code"+sd1.getS_code());


	}

}
