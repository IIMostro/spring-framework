package org.ilmostro.web.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * 通过实现WebMvcConfigurer来实现自定义的配置
 * 在Java8之前需要继承WebMvcConfigurerAdapter来完成，但是Java8有default的默认实现，所以现在都是直接实现该接口
 *
 * @see WebMvcConfigurer
 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
 * @author li.bowei
 */
@Configuration
public class CustomWebMvcConfiguration implements WebMvcConfigurer {

	private static final Logger logger = LoggerFactory.getLogger(CustomWebMvcConfiguration.class);

	@Override
	public void addInterceptors(@NonNull InterceptorRegistry registry) {

		// 这个地方注册进去的拦截器不会注册到 spring-mvc开启<mvc:annotation-driven/>的RequestMappingHandlerMapping
		registry.addInterceptor(new HandlerInterceptor() {
			@Override
			public boolean preHandle(@NonNull HttpServletRequest request,
					@NonNull HttpServletResponse response,
					@NonNull Object handler) {

				logger.info("this is custom interceptors, current handler:{}", handler.getClass().getSimpleName());

				return true;
			}
		});
	}
}
