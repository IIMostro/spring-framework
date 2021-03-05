package org.ilmostro;

import org.ilmostro.configuration.ApplicationConfiguration;
import org.ilmostro.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author li.bowei
 **/
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		UserService bean = applicationContext.getBean(UserService.class);
		bean.hello();
	}
}