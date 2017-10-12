package com.fashionista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fashionista.DAO.SupplierDAO;
import com.fashionista.Model.Supplier;

@Controller


public class SupplierController {
	
    @Autowired
    SupplierDAO sdao;
   
   
              

    @RequestMapping(value="Supplier", method=RequestMethod.GET)
    public ModelAndView getLogin(@ModelAttribute("Supplier")Supplier supplier)
    {
                          //System.out.println("Supplier");
                          ModelAndView model=new ModelAndView("Supplier");
                          return model;
    }
   
   
    @RequestMapping(value="Supplier", method=RequestMethod.POST)
    public ModelAndView Success(Supplier add, Model m)
    {
                          sdao.addsup(add);
                          ModelAndView model=new ModelAndView("viewsupplier","Supplier", new Supplier());
                          return model;
    

}
}
