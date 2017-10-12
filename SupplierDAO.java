package com.fashionista.DAO;

import org.springframework.stereotype.Service;

import com.fashionista.Model.Supplier;
@Service("addsupplierDAO")
public interface SupplierDAO {
	public void addsup(Supplier sup);
	public void editsup(int i);
	public void delsup(int i);
	public void showsup();

}
