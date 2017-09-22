package com.fashionista.serviceImpl;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionista.DAO.RegisterDAO;
import com.fashionista.Model.Register;
@Service
public class RegisterImpl implements RegisterDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public void adduser(Register reg) {
		System.out.println("Register DAO");
		System.out.println(reg.getName());
		//UserCredential uc=new UserCredential();
		//uc.setUsername(r.getUsername());
		//uc.setPassword(r.getPassword());
		
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(reg);
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
	public void edituser(int i) {
		// TODO Auto-generated method stub
		
		}
		public void deluser(int i) {
			// TODO Auto-generated method stub
			
		}
		public void showuser() {
			// TODO Auto-generated method stub
			
		}
		
	}
	