package com.fashionista.serviceImpl;

import org.hibernate.Transaction;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionista.DAO.ProductDAO;
import com.fashionista.Model.Product;

@Service
public class ProductImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	

	public void addpro(Product pro) {
		System.out.println("Product DAO");
		System.out.println(pro.getpname());
		//UserCredential uc=new UserCredential();
		//uc.setUsername(r.getUsername());
		//uc.setPassword(r.getPassword());
		
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(pro);
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
	public void editpro(int i) {
		// TODO Auto-generated method stub
		
		}
		public void delpro(int i) {
			// TODO Auto-generated method stub
			
		}
		public void showpro() {
			// TODO Auto-generated method stub

}


		public List<Product> getProducts() {
	    	Session session =sessionFactory.openSession();
	    	 Transaction transaction =  session.beginTransaction();
	    	List<Product> productList=null;
 	        try {
 	        productList= session.createQuery("from Product").list();   
 	        
      	    transaction.commit();                 
           }
          catch (Exception e) {
          transaction.rollback();
          e.printStackTrace();
	       }
 	     sessionFactory.close();
		 return productList;
	    }
}
