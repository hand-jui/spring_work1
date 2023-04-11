package com.example.demo5_1.dto;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String name;
	@Min(message = "야아 고졸하고와라", value = 19)
	private Integer age;
	private Integer height;
	@Email(message = "니 이메일도 모르냐")
	private String email;
}
