package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
