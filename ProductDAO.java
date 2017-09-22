package com.fashionista.DAO;

import org.springframework.stereotype.Service;

import com.fashionista.Model.Product;

@Service("addproductDAO")
public interface ProductDAO {
	public void addpro(Product a);
	public void editpro(int i);
	public void delpro(int i);
	public void showpro();

}
