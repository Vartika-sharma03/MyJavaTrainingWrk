package com.test.hellow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[])
	{	@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		HellowBean hb=(HellowBean)con.getBean("HellowBean");
		hb.sayHellow();
		   Ticket t1=(Ticket)con.getBean("ticket");  
		     t1.display();  
		
	}
}
