package org.ilmostro.core;



import java.util.Map;

import org.ilmostro.core.configuration.ApplicationConfiguration;
import org.ilmostro.core.imported.Color;
import org.ilmostro.core.service.aspect.SimpleAspectService;
import org.ilmostro.core.service.transaction.DemoTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author li.bowei
 **/
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

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

		DemoTransactionService transaction = applicationContext.getBean(DemoTransactionService.class);
		transaction.transaction();
//		OrderService bean = applicationContext.getBean(OrderService.class);
//		User bean1 = applicationContext.getBean(User.class);
//		ObjectMapperUtils utils = applicationContext.getBean(ObjectMapperUtils.class);
//		utils.say();
		imported(applicationContext);
	}

	public static void imported(ApplicationContext context){
		Map<String, Color> colorMap = context.getBeansOfType(Color.class);
		colorMap.forEach((key, value) -> logger.info("beanName:{}, witch:{}", key, value.witch()));
	}
}