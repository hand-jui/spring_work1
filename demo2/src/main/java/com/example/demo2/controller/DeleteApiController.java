package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class DeleteApiController {

//	METEOH : delete
//	http://localhost:8080/api2/delete/{userId}
//	http://localhost:8080/api2/delete/{userId}?account=우리은행
//	http://localhost:8080/api2/delete/100?account=우리은행
	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	
//	문제 DELETE 주소 설계 및 응답 처리
//	path, qurey, path + qurey 둘다 사용
	@DeleteMapping("/deleteP/{name}")
	public void deleteP(@PathVariable String name, @RequestParam String mind) {
		System.out.println("name : "+name);
		System.out.println(mind);
	}
}
