package org.ilmostro.core.service.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author li.bowei
 **/
@Service
public class OrderService implements ApplicationContextAware, InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

	static{
		logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<<static method");
	}

	public OrderService() {
		logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<<OrderService()");
	}

	/**
	 * 没有执行到这个注释，但是这个方法的执行在BeanPostProcessor.postProcessBeforeInitialization之后
	 * 和InitializingBean.afterPropertiesSet之前
	 *
	 * @see org.springframework.beans.factory.config.BeanPostProcessor
	 * @see org.springframework.beans.factory.InitializingBean
	 */
	@PostConstruct
	public void init() {
		logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<<@PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<< InitializingBean.afterPropertiesSet()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		logger.info(">>>>>>>>>>>>>>>>>[OrderService]<<<<<<<<<<<<<<<<ApplicationContextAware.applicationContext()");
	}
}
