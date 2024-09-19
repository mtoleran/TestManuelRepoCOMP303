package com.va.week3.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.va.week3.springmvc.model.Order;

@Controller
public class OrderController {
	
	
@RequestMapping("/phonewebform")
public String PhoneOrder(@ModelAttribute(name="phoneform") Order order , Model m) {
	//Get the input values from the index page 
    String firstName = order.getFirstName();
    String lastName=order.getLastName();
   //..
	// do for all the attirbutes.. and then connect with appropriate page to load.. success or failure.. 
	
	return null;
	
}

/*
	public class LoginController {
	//Request mapping to process index page request
	     @RequestMapping("/login")
	     public String login(@ModelAttribute(name="loginForm") LoginBean loginBean, Model m) {
	      //Get the input values from the index page 
	      String userName = loginBean.getUsername();
	      String password = loginBean.getPassword();
	      String message;
	      
	      //check the credentials using model class method
	      boolean checkResult = loginBean.checkCredentials(userName, password);
	      
	      if(checkResult)
	      {
	        //when the credentials are valid  
	          message = "Hi " +userName + ".";
	          m.addAttribute("message", message);
	          m.addAttribute("username", userName);
	        //return to the success-login Thymeleaf page
	          return "success-login";
	          
	      }
	      else
	      {
	        //when the credentials are invalid 
	          message = "Invalid credentials.";
	          m.addAttribute("message", message);
	      //return to the error-login Thymeleaf page
	          return "error-login";
	      }
	      
	    }   

	}
	
	
*/
}
