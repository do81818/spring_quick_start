package com.springbook.ioc.injection;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		Properties adressList = bean.getAddressList();
		
		System.out.println(adressList);
//		for(String address : adressList) {
//			System.out.println(address.toString());
//		}
		
		factory.close();
	}
}
