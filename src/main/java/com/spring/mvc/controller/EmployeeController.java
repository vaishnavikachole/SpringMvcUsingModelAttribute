package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.model.Employee;

@Controller
public class EmployeeController {

	@ModelAttribute
	public void commonData(Model model)
	{
		model.addAttribute("Header","Direction Software Solution");
		model.addAttribute("Description","software company, mumbai");
		}
	
	@RequestMapping("/employee")
	public String showForm()
	{
		return "employee";
	}
	
	@RequestMapping(path="/employeeform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute Employee employee, Model model)
	{	
		System.out.println(employee);
		return "success";
	}
	

//	@RequestMapping(path="/employeeform",method=RequestMethod.POST)
//	public String handleForm(@ModelAttribute("employee") Employee employee)
//	{	
//		System.out.println(employee);
//		return "success";
//	}
//	
	@RequestMapping("/redirect")
	public String firstHandler()           
	{
		System.out.println("in first handler");
		return "redirect:/www.google.com";            // redirect url using redirect prefix
	}
	
	@RequestMapping("/redirectview")
	public RedirectView secondHandler()
	{
		RedirectView redirectview = new RedirectView(); // redirect url using redirectview object
		
		redirectview.setUrl("/employee");
		return redirectview;
	}

}
