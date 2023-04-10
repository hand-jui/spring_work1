package com.example.demo4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.dto.User;

@RestController // IoC의 관리 대상이 된다. (spring container) BEAN 객체 (싱글톤 패턴으로 올라가있다)
@RequestMapping("/api")
public class RestApiController {

//	http://localhost:8080/api/get/100
	@GetMapping("/get/{id}")
	public void get(@PathVariable Long id) {
		System.out.println("METHOD : GET");
		System.out.println("id : " + id);
	}

	@PostMapping("/post")
	public ResponseEntity<User> post(@RequestBody User user) {
		System.out.println("METHOD : POST");
		System.out.println("user : " + user.toString());
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

}
