
package com.fashionista.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

	
import com.fashionista.DAO.RegisterDAO;

import com.fashionista.Model.Register;


@Controller("registercontroller")
public class RegisterController 
{
	
	@Autowired
	RegisterDAO rdao;
	
	
		

	@RequestMapping(value="Register", method=RequestMethod.GET)
	public ModelAndView getLogin(@ModelAttribute("Register")Register register)
	{
			System.out.println("Register");	
			ModelAndView model=new ModelAndView("Register");
			return model;
	}
	
	@RequestMapping(value="Register", method=RequestMethod.POST)
	public ModelAndView Success(Register reg, Model m)
	{
			rdao.adduser(reg);
			ModelAndView model=new ModelAndView("login","Register", new Register());
			return model;
	}
	

	
	
}


