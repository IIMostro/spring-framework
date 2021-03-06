package org.ilmostro.core.service.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author li.bowei
 **/
@Component
public class OrderServiceProcess implements BeanPostProcessor {

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceProcess.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof OrderService){
			logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<<BeanPostProcessor.postProcessBeforeInitialization!");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof OrderService){
			logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<<BeanPostProcessor.postProcessAfterInitialization!");
		}
		return bean;
	}
}
