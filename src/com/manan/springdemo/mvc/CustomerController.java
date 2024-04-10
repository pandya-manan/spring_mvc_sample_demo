package com.manan.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Adding init-binder method so that all the leading and whitespaces can be removed while entering data in the form
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer")Customer customer,BindingResult bindingResult)
	{
		System.out.println("Last Name: |"+ customer.getLastName() + "|");
		System.out.println("First Name: |"+ customer.getFirstName() + "|");
		System.out.println("Binding Result: "+bindingResult.toString());
		if(bindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-process-form";
		}
		
	}

}
