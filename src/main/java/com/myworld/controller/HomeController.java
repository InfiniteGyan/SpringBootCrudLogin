package com.myworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myworld.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/a")
	public String index()
	{
		return "indexa";
	}
	
	@RequestMapping("/")
	public String product(Model model)
	{
		model.addAttribute("products", productService.allProduct());
		return "index";
	}

}
