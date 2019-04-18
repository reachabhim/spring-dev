package com.abhim.demo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/funny")
public class HelloWorldController {
	
	//controller to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//controller to process the response
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller to process the response with model
	@RequestMapping("/processFormV2")
	public String letsShoutOutDude(HttpServletRequest request, Model model, @RequestParam("studentName") String theName) {
		//String name = request.getParameter("studentName");
		
		//String result = "Yo! "+name.toUpperCase();
		
		String result = "Yo!!! "+theName.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
		

}
