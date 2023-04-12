package com.example.demo6.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo6.dto.CustomError;

@RestControllerAdvice // IoC의 대상이 된다. -> spring contain에 들어가고 싱글톤 뭐시기
//@ControllerAdvice // 페이지 리턴 오류시 작동
public class GlobalControllerAdvice {

//	모든 예외를 여기서 처리하고 싶다면
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> exception(Exception e) {

		System.out.println("================");
		System.out.println(e.getClass());
		System.out.println(e.getMessage());
		System.out.println("----------------");

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
	}

//	특정 예외를 잡아서 다르게 응답 처리하고 싶다면
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {

//		디버깅
//		어떤 필드가 잘못 되었는지 message가 뭔지 String으로 재정의해서 응답 처리

//		StringBuilder 사용
//		데이터 가공해서 적절하게 응답

//		StringBuilder sb = new StringBuilder();
		List<CustomError> errorList = new ArrayList<>();
		e.getAllErrors().forEach(error -> {
//			System.out.println("------------");
//			System.out.println(error.getCode());
//			System.out.println(error.getDefaultMessage());
//			System.out.println("------------");
//
//			sb.append("field : " + error.getCode());
//			sb.append("\n");
//			sb.append("message : " + error.getDefaultMessage());
//			sb.append("\n");

			String field = error.getCode();
			String message = error.getDefaultMessage();
			CustomError customError = new CustomError();
			customError.setField(field);
			customError.setMessage(message);
			errorList.add(customError);
		});

		System.out.println("잘못된 값 입력");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorList);
	}

	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<?> httpMessageNotReadableException(HttpMessageNotReadableException e) {
		System.out.println("잘못된 형식 : JSON 문법 좀 외워라..");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

	@ExceptionHandler(value = BindException.class)
	public ResponseEntity<?> bindException(BindException e) {
		System.out.println("get 방식으로 던질 때 값 잘못 던짐");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

}
