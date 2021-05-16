package com.capg.jpa.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		// ---- write code for data base operation ----

		Account a = new Account();
		a.setAccountHolderName("tara");
		a.setBalance(3000);
		
		
		session.save(a);  // insert into Account .....
		
		System.out.println("  -->> Data Saved ..");
	//	t.commit();
		
		a = (Account)session.get(Account.class, 2);
		System.out.println(a);
		
		
		// get entity from database
        Account a2 = session.get(Account.class, 1);
        // do changes 
        a2.setAccountHolderName("Rama");
        // update the student object
        session.saveOrUpdate(a2);
        
        //delete
        session.delete(session.get(Account.class, 5));

        // commit transaction
        t.commit();
		
		
		
		session.close();
		System.out.println("All Done");
		
		
	}
}