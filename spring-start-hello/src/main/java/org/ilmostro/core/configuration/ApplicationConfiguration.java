package org.ilmostro.core.configuration;

import org.ilmostro.core.imported.EnableAutoCustomBeanImported;
import org.ilmostro.core.service.circular.UserService;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author li.bowei
 **/
@Configuration
@ComponentScan("org.ilmostro.core")
@EnableAspectJAutoProxy
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@EnableAutoCustomBeanImported
public class ApplicationConfiguration {

	@Bean
	public UserService userService(){
		return new UserService();
	}
}
