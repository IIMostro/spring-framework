package org.ilmostro.configuration;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * 使用注解的方式来配置三大件。
 * 可以自定义也可以通过@EnableWebMvc来打开默认的配置
 * 这三大件在Dispatcher中都是通过循环的方式去获取，如果三大件能处理成功就直接返回
 *
 * @see org.springframework.web.servlet.config.annotation.EnableWebMvc
 *
 * // 这三个方法都是通过遍历来找到合适的组件
 * @see org.springframework.web.servlet.DispatcherServlet#getHandler(javax.servlet.http.HttpServletRequest)
 * @see org.springframework.web.servlet.DispatcherServlet#getHandlerAdapter(Object)
 * @see org.springframework.web.servlet.DispatcherServlet#resolveViewName(String, Map, Locale, HttpServletRequest)
 *
 * @author li.bowei
 */
@Configuration
@EnableWebMvc
public class WebMvcConfiguration {

//	@Bean
//	public HandlerMapping requestMappingHandlerMapping(){
//		return new RequestMappingHandlerMapping();
//	}
//
//	@Bean
//	public HandlerAdapter requestMappingHandlerAdapter(){
//		return new RequestMappingHandlerAdapter();
//	}

	@Bean
	public ViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
