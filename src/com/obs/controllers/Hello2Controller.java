package com.obs.controllers;

import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.obs.pojos.Customer;

@Controller // mandatory
@RequestMapping("/test") // optional
public class Hello2Controller {
	@GetMapping(value = "/hello2")
	public String sayHello2(Model map, @RequestParam String name, @RequestParam(name = "age") int age123,
			@RequestParam Date joinDate) {
		System.out.println("in say hello2 " + map);
		map.addAttribute("emp_info", "Name " + name + " age " + age123 + " join date " + joinDate);
		return "cust/welcome";
	}

	@GetMapping(value = "/hello3/{empName}/{age}/{joinDate}")
	public String sayHello3(Model map, @PathVariable String empName, @PathVariable int age,
			@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date joinDate) {
		System.out.println("in say hello3 " + map);
		map.addAttribute("emp_info", "Name " + empName + " age " + age);
		map.addAttribute("join_date", joinDate);
		return "cust/welcome";
	}

}
