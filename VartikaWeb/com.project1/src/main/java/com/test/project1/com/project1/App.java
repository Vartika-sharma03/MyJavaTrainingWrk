package com.test.project1.com.project1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.project1.books.books;

public class App {
	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("test1");
		EntityManager em=emf.createEntityManager();
		books b=em.find(books.class, 1);
		System.out.println(b);
		books b1=new books();
		b1.setBookid(2);
		b1.setBookname("Geetanjali");
		b1.setBookprice(1000);

		em.getTransaction().begin();
		em.persist(b1);
		em.getTransaction().commit();

		em.persist(b1);
		System.out.println("data added are");
		System.out.println(b1);
	}
}
