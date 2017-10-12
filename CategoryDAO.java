package com.fashionista.DAO;

import org.springframework.stereotype.Service;

import com.fashionista.Model.Category;
@Service("addcategoryDAO")

public interface CategoryDAO {
	public void addcat(Category cat);
	public void editcat(int i);
	public void delcat(int i);
	public void showcat();


}
