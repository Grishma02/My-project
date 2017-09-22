package com.fashionista.controller;


	import org.springframework.stereotype.Controller;

	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller("homepageconttroller")

	public class HomepageController {

	@RequestMapping(value="Register")
	public String account()  
	{
		System.out.println("Register");
		return "Register";
	}
	}
	@Controller("AboutController")
	class AboutController {


			@RequestMapping(value="AboutUs")
			public String details()  
			{
				System.out.println("AboutUs");
				return "AboutUs";
			}
			}
	@Controller("BrandsController")
	class BrandsController {
		
			@RequestMapping(value="Brands")
			public String company()  
			{
				System.out.println("Brands");
				return "Brands";
			}
			}
	@Controller("Contactcontroller")
	 class ContactController {


		@RequestMapping(value="ContactUs")
		public String Contact()  
		{
			System.out.println("ContactUs");
			return "ContactUs";
		}
		}

	@Controller("LoginController")

	class LoginController {


			@RequestMapping(value="login")
			public String log()  
			{
				System.out.println("login");
				return "login";
			}
			}




	@Controller("Adminlogincontroller")
	class AdminLoginController {


			@RequestMapping(value="AdminLogin")
			public String details()  
			{
				System.out.println("AdminLogin");
				return "AdminLogin";
			}
			}


	@Controller("addproductcontroller")
	class AddProductController {


			@RequestMapping(value="Product")
			public String details()  
			{
				System.out.println("Product");
				return "Product";
			}
			}

	
	@Controller("viewcontroller")
	class viewController {


			@RequestMapping(value="view")
			public String details()  
			{
				System.out.println("view");
				return "view";
			}
			}