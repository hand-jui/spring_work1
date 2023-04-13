package com.example.demo9.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private AuthInterceptor authInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		authInterceptor 동작 시킬 때 모든 페이지 가로채면 무조건 리다이렉트
//		명시하는 요청 설계 주소에서만 동작

//		http://localhost:8080/hello <-- interceptor 동작하지 않음
//		http://localhost:8080/mypage/myinfo <-- interceptor 동작
		registry.addInterceptor(authInterceptor).addPathPatterns("/mypage/**");
	}
}
