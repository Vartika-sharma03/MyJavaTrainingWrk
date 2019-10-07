package com.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotatioin.model.Country;
import com.annotation.configuration.ApplicationConfiguration;

public class SpringJavaConfigMain{
	public static void main(String[] args) {		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Country countryObj = (Country) appContext.getBean("countryObj");
		String countryName=countryObj.getCountryName();
		System.out.println("Country name: "+ countryName);
	}
}