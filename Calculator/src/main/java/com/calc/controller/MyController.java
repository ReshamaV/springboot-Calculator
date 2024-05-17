package com.calc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calc.controller.entities.Calculator;
@Controller
public class MyController {
	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("operator","+");
		return "index";
	}
	@PostMapping("/")
	public String index(
			@RequestParam String num1,
			@RequestParam String operator,
			@RequestParam String num2,
			Model model
	) {
		double lnum1;
		double rnum2;

		try {
			lnum1 = Double.parseDouble(num1);
		}
		catch (NumberFormatException ex) {
			lnum1 = 0;
		}

		try {
			rnum2 = Double.parseDouble(num2);
		}
		catch (NumberFormatException ex) {
			rnum2 = 0;
		}
		Calculator calculator = new Calculator(
				lnum1,
				rnum2,
				operator
		);
		
		double result = calculator.Result();
		model.addAttribute("num1", lnum1);
		model.addAttribute("operator", operator);
		model.addAttribute("num2", rnum2);
		model.addAttribute("result", result);

	//	model.addAttribute("view", "views/calculatorForm");
		return "index";
}
}
