package org.ilmostro;

import org.ilmostro.configuration.ApplicationConfiguration;
import org.ilmostro.service.aspect.SimpleAspectService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author li.bowei
 **/
public class Application {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.ilmostro");
		/*
		 这个ApplicationConfiguration有没有@Configuration都无所谓，spring会将这个类注册为一个类，
		  但是不能没有@ComponentScan ，ConfigurationClassParser这个类会去解析ComponentScan获取扫描组件下的bean
		  @see org.springframework.context.annotation.ConfigurationClassParser
		 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		SimpleAspectService service = applicationContext.getBean(SimpleAspectService.class);
		service.say();
//		OrderService bean = applicationContext.getBean(OrderService.class);
//		User bean1 = applicationContext.getBean(User.class);
//		ObjectMapperUtils utils = applicationContext.getBean(ObjectMapperUtils.class);
//		utils.say();
	}
}