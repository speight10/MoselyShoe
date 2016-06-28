package com.Mosely.shoe.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ComponentScan
public class ShoeController {
	
	
	
	
	 @RequestMapping(value="/", method=RequestMethod.GET)
	    public String greetingForm(Model model) {
	        
	        return "index";
	    }
	

}
