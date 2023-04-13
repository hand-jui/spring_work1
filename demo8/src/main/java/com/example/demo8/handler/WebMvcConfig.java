package com.example.demo8.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * 1. implements WebMvcConfigurer 구현처리하기
 * 2. addInterceptors 오버라이드
 */
@Configuration // 1개 이상 빈으로 등록해야할 때
public class WebMvcConfig implements WebMvcConfigurer {

//	DI를 사용하는 코드로 변경
	@Autowired // DI 적용
	private LoggingInterceptor loggingInterceptor;

//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
////		직접 만든 인터셉터 구현클래스를 등록처리
//		registry.addInterceptor(new LoggingInterceptor());
//
//	}

}
