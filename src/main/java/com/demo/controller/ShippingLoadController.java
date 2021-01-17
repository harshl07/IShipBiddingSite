package com.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.ShippingLoad;
import com.demo.service.ShippingLoadService;

@Controller
public class ShippingLoadController {

	@Autowired
	ShippingLoadService shippingLoadService;
	
	//display empty form for accept new shippingLoad 
	@RequestMapping("/showform")
	public String acceptShippingLoad(Model m) {
		
		m.addAttribute("command", new ShippingLoad());
		return "addLoad";
		
	}

	// using spring form tag  save shippingLoad in the database
	@RequestMapping(value="/addLoad", method=RequestMethod.POST)
	public ModelAndView saveShippingLaod(@ModelAttribute("load") ShippingLoad shippingLoad) {
		
		shippingLoadService.addShippingLaod(shippingLoad);
		return new ModelAndView("redirect:/viewProducts");			
	
	}
	
	
	@RequestMapping("/loadDetail/{id}")
	public ModelAndView getShippingLoadDetails(@PathVariable("id") int shippingLoadID)
	{	
		ShippingLoad shippingLoad=shippingLoadService.getLoadDetails(shippingLoadID);	
		return new ModelAndView("displayloadDetail","shippingLoad",shippingLoad);
	}
}
