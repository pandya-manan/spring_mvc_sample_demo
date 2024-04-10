package com.manan.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "show-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "process-form";
	}

	//new controller method to read form data
	//add data to the model
	@RequestMapping("/processFormTwo")
	public String trialMethod(HttpServletRequest request, Model model)
	{
		//read the request parameter from the HTML Form
		String theName=request.getParameter("studentName");
		//convert the input data from user to caps
		theName=theName.toUpperCase();
		//create the message
		String result="Yo! "+theName;
		//add message to the model
		model.addAttribute("message",result);
		return "process-form";
	}
	
	@RequestMapping("/processFormThree")
	public String demoMethod(@RequestParam("studentName")String name, Model model)
	{
		//read the request parameter from the HTML Form
		String theName=name;
		//convert the input data from user to caps
		theName=theName.toUpperCase();
		//create the message
		String result="Hello Good Evening "+theName;
		//add message to the model
		model.addAttribute("message",result);
		return "process-form";
	}
}
