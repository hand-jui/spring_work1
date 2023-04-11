package com.example.demo5_1.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5_1.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

	@PostMapping("/user")
	public ResponseEntity<User> user(@RequestBody User user) {

		if (user.getAge() < 1 || user.getAge() > 101) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
		}
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	@PostMapping("/user2")
	public ResponseEntity<User> user2(@Valid @RequestBody User user) {

		return ResponseEntity.ok(user);
	}

	@PostMapping("/user3")
	public ResponseEntity<?> user3(@Valid @RequestBody User user, BindingResult bindingResult) {

		StringBuilder sb = new StringBuilder();

		if (bindingResult.hasErrors()) {
			bindingResult.getAllErrors().forEach(error -> {

				sb.append("field : " + error.getCode());
				sb.append("\n");
				sb.append("message : " + error.getDefaultMessage());
				sb.append("\n");

			});
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
		}

		return ResponseEntity.ok(user);
	}

}
