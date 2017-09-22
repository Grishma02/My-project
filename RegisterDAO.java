package com.fashionista.DAO;

import org.springframework.stereotype.Service;


import com.fashionista.Model.Register;

@Service("registerDAO")
public interface RegisterDAO {
	public void adduser(Register r);
	public void edituser(int i);
	public void deluser(int i);
	public void showuser();

}
