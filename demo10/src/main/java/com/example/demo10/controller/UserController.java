package com.example.demo10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo10.dto.User;

@Controller
public class UserController {

	@GetMapping("/loginPage")
	public String loginPage() {

		return "login.html"; // 내부에서 이동
	}
	
	@PostMapping("/loginProc")
	public String loginProc(HttpServletRequest request, HttpServletResponse response,User principal) {
		
		HttpSession session = request.getSession();
		
		session.setAttribute("principal", principal);
		
		
		return "redirect:/auth/infoPage";
	}

	/*
	 * 인증된 사용자만 들어올 수 있게 막자~
	 * AuthInterceptor 동작 시키려면 주소 설계를 /auth/** 으로 해야함
	 */
	@GetMapping("/auth/infoPage")
	public String infoPage(HttpServletRequest request) {

		HttpSession session = request.getSession();

		Object principal = session.getAttribute("principal");
		if (principal == null) {
			return "redirect:/loginPage";
		}
		System.out.println("이 코드 실행하려면 로긴해야함");
//		상대 위치 -> 현재 시점에 맞게 설계
//		이 위치에서 상대 경로로 찾을지 절대 경로로 찾을지 결정
		
//		http://localhost:8080/info.html  -> URL
//		http://localhost:8080/auth/info  -> URI
//		redirect <-- 브라우저로 돌아 갔다 옴
//		새로운 request 와 response 객체가 만들어 진다.
		
		return "/info.html";
//		return "redirect:/auth/infoPage";
	}

}
