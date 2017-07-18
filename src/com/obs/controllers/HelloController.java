package com.obs.controllers;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.obs.pojos.Customer;

@Controller
public class HelloController {
	@PostConstruct
	public void init() {
		System.out.println("in init");
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("in say hello ");
		return new ModelAndView("welcome", "num_list", Arrays.asList(2, 3, 4, 5, 6));
	}

	@GetMapping(value = "/hello1")
	public String sayHello1(Model map) {
		System.out.println("in say hello1 "+map);
		//add server date & num list for view layer
		map.addAttribute("srvr_dt", new Date());
		map.addAttribute(Arrays.asList(1,2,3,4));
		map.addAttribute(new Customer());
		return "welcome";
	}

}
