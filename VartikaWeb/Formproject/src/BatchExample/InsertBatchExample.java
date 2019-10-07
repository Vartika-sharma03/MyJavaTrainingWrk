package BatchExample;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import BatchExampleClass.Employee;
import BatchExampleClass.HbUtil1;

public class InsertBatchExample {
	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		int batchSize = 50;
		try {
			session = HbUtil1.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			/*for (long i = 1; i <= 100; i++) {
				Employee employee = new Employee();
				employee.setName("Rachna Tyagi " + i);
				employee.setEmail("rtyagi@hotmail.com"); 
				session.save(employee);
				if (i > 0 && i % batchSize == 0) {
					session.flush();
					session.clear();
				}
			

			}*/
			for (long i = 1; i <= 2; i++) {
			Employee employee = new Employee();

			Scanner sc=new Scanner(System.in);
			employee.setName(sc.next());
			employee.setEmail(sc.next());
			session.save(employee);
			if ( i > 0 && i % batchSize == 0) {
				session.flush();
				session.clear();
			}
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		HbUtil1.shutdown();
	}
}
