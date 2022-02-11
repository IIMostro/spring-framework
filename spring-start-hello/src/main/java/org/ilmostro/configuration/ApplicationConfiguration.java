package org.ilmostro.configuration;

import org.ilmostro.service.circular.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author li.bowei
 **/
@Configuration
@ComponentScan("org.ilmostro")
@EnableAspectJAutoProxy
public class ApplicationConfiguration {

	@Bean
	public UserService userService(){
		return new UserService();
	}
}
