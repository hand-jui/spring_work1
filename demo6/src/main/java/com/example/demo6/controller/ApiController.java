package com.example.demo6.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.dto.User;

@RestController
@RequestMapping("/api")
@Validated // 하나씩 key=value 검사하려면 명시해야함. 단, (get)dto 방식은 예외
public class ApiController {

	@GetMapping("/test")
	public String test() {
		
		return "TEST";
	}

//	유효성 검사 동작하도록 코드 변경 하시오
	@GetMapping("/user")
	public User get(@RequestParam String name, @RequestParam Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		return user;
	}

//	구분 --> http body에 데이터 전달 방식
//	1. JSON 형식으로 넣어서 서버로 전달 -> @RequestBody 선언 O
//	2. form 태그 활용해서 key=value 구조로 (Query String 방식) -> @RequestBody 선언 X
	@PostMapping("/user")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}

//	두번째
//	application/x-www-form-urlencoded
	@GetMapping("/user2")
	public User get2(@Validated User reqUser) {

		return reqUser;
	}

}
