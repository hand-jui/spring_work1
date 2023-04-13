package com.example.demo10_1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo10_1.dto.User;

@Controller
public class UserController {

	@GetMapping("/login")
	public String login(Model model) {

		model.addAttribute("user", "");

		return "login";
	}

	@PostMapping("/loginProc")
	public String loginProc(HttpServletRequest request, HttpServletResponse response, User principal) {

		HttpSession session = request.getSession();
		session.setAttribute("principal", principal);
		System.out.println("여기냔");

		return "redirect:/auth/info";
	}

	@GetMapping("/auth/info")
	public String info(HttpServletRequest request) {

		HttpSession session = request.getSession();
		Object principal = session.getAttribute("principal");

		if (principal == null) {
			return "redirect:/login";

		}
		System.out.println("되라");
		
		return "info";
	}

}
