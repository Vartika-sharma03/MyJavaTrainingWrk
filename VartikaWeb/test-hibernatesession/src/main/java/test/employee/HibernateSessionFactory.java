package test.employee;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSessionFactory  {
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	try {
	Configuration configuration = new Configuration();
	configuration.configure()
	.setProperty("hibernate.show_sql", "false");
	
	serviceRegistry = new ServiceRegistryBuilder().applySettings(
	configuration.getProperties()).buildServiceRegistry();
	factory = configuration.buildSessionFactory(serviceRegistry);
	} catch (Throwable ex) {
	System.err.println("Failed to create sessionFactory object." + ex);
	throw new ExceptionInInitializerError(ex);
	}
	System.out.println("**Example : Hibernate 4 SessionFactory**");
	System.out.println("----------------------------------------");
	Session session = factory.openSession();
	Transaction tx = null;
	try {
	tx = session.beginTransaction();
	List employees = session.createQuery("FROM Employee").list();
	for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
	Employee emp = (Employee) iterator.next();
	System.out.println("First Name: " + emp.getFirstName());
	System.out.println("Last Name: " + emp.getLastName());
	System.out.println("Salary: " + emp.getSalary());
	System.out.println("----------------------------------------");
	}
	tx.commit();
	} catch (HibernateException e) {
	if (tx != null)
	tx.rollback();
	e.printStackTrace();
	} finally {
	session.close();
	}
	}
	}