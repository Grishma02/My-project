package com.fashionista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fashionista.DAO.ProductDAO;
import com.fashionista.Model.Product;
@Controller
public class ProductController {
	

	    @Autowired
	    ProductDAO pdao;
	   
	   
	              

	    @RequestMapping(value="Product", method=RequestMethod.GET)
	    public ModelAndView getLogin(@ModelAttribute("Product")Product product)
	    {
	                          System.out.println("Product");
	                          ModelAndView model=new ModelAndView("Product");
	                          return model;
	    }
	   
	   
	    @RequestMapping(value="Product", method=RequestMethod.POST)
	    public ModelAndView Success(Product add, Model m)
	    {
	                          pdao.addpro(add);
	                          ModelAndView model=new ModelAndView("viewproduct","Product", new Product());
	                          return model;
	    }
	              



@RequestMapping(value="viewproduct")
public ModelAndView listOfTeams() {
 //AddProduct addp=new AddProduct();
    ModelAndView modelAndView = new ModelAndView("viewproduct");
     	        List<Product> teams = pdao.getProducts();
     	        //System.out.println("obj:"+teams);
    modelAndView.addObject("lists", teams);
    	        return modelAndView;
}
}
