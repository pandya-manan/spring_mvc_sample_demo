package com.manan.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrialController {
	
	@RequestMapping("/showForm")
	public String displayTheForm()
	{
		return "trial";
	}

}
