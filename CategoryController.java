package com.fashionista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fashionista.DAO.CategoryDAO;
import com.fashionista.Model.Category;
import com.fashionista.Model.Supplier;

@Controller

public class CategoryController {
	@Autowired
    CategoryDAO cdao;
   
   
              

    @RequestMapping(value="Category", method=RequestMethod.GET)
    public ModelAndView getLogin(@ModelAttribute("Category") Category category)
    {
                          //System.out.println("Supplier");
                          ModelAndView model=new ModelAndView("Category");
                          return model;
    }
   
   
    @RequestMapping(value="Category", method=RequestMethod.POST)
    public ModelAndView Success(Category add, Model m)
    {
                          cdao.addcat(add);
                          ModelAndView model=new ModelAndView("viewcategory","Category", new Category());
                          return model;
    

}
}


