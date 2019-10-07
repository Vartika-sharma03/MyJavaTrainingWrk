package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import test.modell.Employee1;
import test.modell.Phone;

public class MainOnetoOne {
public static void main(String[] args) {
		
		createEmployee();
	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public static void createEmployee() {
		System.out.println("****************Creating Employee*************");
		Employee1 emp = new Employee1("Dhruv Mehta", 33);
		Phone ph = new Phone();
		ph.setNo("5000045690");
		ph.setEmp(emp);
		emp.setPhone(ph);
		Session session = getSessionFactory().openSession();
		session.save(emp);

		session.save(ph);
		session.close();
		System.out.println("Employee Created Successfully" + emp.toString());

	}

}