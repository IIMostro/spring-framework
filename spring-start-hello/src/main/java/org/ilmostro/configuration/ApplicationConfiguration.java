package org.ilmostro.configuration;

import org.ilmostro.service.circular.UserService;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author li.bowei
 **/
@Configuration
@ComponentScan("org.ilmostro")
@EnableAspectJAutoProxy
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
public class ApplicationConfiguration {

	@Bean
	public UserService userService(){
		return new UserService();
	}
}
