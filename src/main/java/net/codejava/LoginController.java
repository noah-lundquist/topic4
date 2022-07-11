package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired OrdersBusinessServiceInterface service;
	@Autowired SecruityBusinessService security;
	
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		this.service.test();
		this.security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		System.out.println(String.format("Form with Username of %s and Password of %s",loginModel.getUsername(), loginModel.getPassword()));
		

		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", service.getOrders());
		
		return "orders";
	}
}
