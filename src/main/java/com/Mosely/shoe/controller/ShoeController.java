package com.Mosely.shoe.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Mosely.shoe.controller.model.Contact;

@Controller
@ComponentScan
public class ShoeController {
	
	
	
	
	 @RequestMapping(value="/", method=RequestMethod.GET)
	    public String greetingForm(Model model) {
		 model.addAttribute("contact",new Contact());
	        return "index";
	    }
	
	 
	 
	 
	 @RequestMapping(value="/", method=RequestMethod.POST)
	    public String greetingFormSubmit(@ModelAttribute Contact contact, Model model) {
		 model.addAttribute("contact",contact);
	        
	        return "index";
	    }
	

}
