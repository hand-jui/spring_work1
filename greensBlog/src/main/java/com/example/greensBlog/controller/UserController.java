package com.example.greensBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // IoC 처리
public class UserController {

//	http://localhost:8080/
//	http://localhost:8080/user
	@GetMapping({ "/", "main" })
	public String userPage(Model model) {
//		yml 파일 설정
//	    prefix: /WEB-INF/view/
//	    suffix: .jsp

//		/WEB-INF/view/user.jsp <--가 완성됨
//		viewResolver 가 동작해서 페이를 찾고 리턴

//		데이터를 내려 보내고 싶다면

		model.addAttribute("principal", "헬로");
		return "main";
	}

}
