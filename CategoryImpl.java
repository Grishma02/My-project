package com.fashionista.serviceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.fashionista.DAO.CategoryDAO;
import com.fashionista.Model.Category;

@Service


public class CategoryImpl implements CategoryDAO {
SessionFactory sessionFactory;
	

	public void addcat(Category cat) {
		//System.out.println("Supplier DAO");
		//System.out.println(sup.getsname());
		//UserCredential uc=new UserCredential();
		//uc.setUsername(r.getUsername());
		//uc.setPassword(r.getPassword());
		
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(cat);
		//session.save(uc);
		tx.commit();
		session.flush();
		session.close();
		} 
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}		

	}


	public void editcat(int i) {
		// TODO Auto-generated method stub
		
	}


	public void delcat(int i) {
		// TODO Auto-generated method stub
		
	}


	public void showcat() {
		// TODO Auto-generated method stub
		
	}
	

}
