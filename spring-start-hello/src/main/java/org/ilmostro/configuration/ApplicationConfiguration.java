package org.ilmostro.configuration;

import org.ilmostro.service.circular.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author li.bowei
 **/
@Configuration
@ComponentScan("org.ilmostro")
public class ApplicationConfiguration {


	@Bean
	public UserService userService(){
		return new UserService();
	}
}
