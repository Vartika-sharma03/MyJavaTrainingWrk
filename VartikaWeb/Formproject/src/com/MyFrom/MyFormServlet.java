package com.MyFrom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Frompojo.FormPojo;
import com.Frompojo.HButil;


@WebServlet("/MyFormServlet")
public class MyFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HButil.getSessionFactory().openSession();
			transaction=session.getTransaction();
			if(!transaction.isActive()) 
				transaction.begin();
		
			FormPojo pj=new FormPojo();
			pj.setRollno(Integer.parseInt(request.getParameter("rollNo")));
			pj.setAddress(request.getParameter("address"));
			pj.setFirstName(request.getParameter("first_name"));
			pj.setLastName( request.getParameter("last_name"));
			session.save(pj);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		HButil.shutdown();

	}}


