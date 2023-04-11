package com.example.demo5.dto;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	private String name;
	@Min(10)
	private Integer age;
	@Email(message = "니 이메일 모르냐")
	private String email;
	private String phoneNumber;

}
