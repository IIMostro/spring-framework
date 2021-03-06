package org.ilmostro.service.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author li.bowei
 **/
@Service
public class OrderService implements InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

	public OrderService() {
		logger.info("this is order service  construct");
	}

	/**
	 * 没有执行到这个注释，但是这个方法的执行在BeanPostProcessor.postProcessBeforeInitialization之后
	 * 和InitializingBean.afterPropertiesSet之前
	 * @see org.springframework.beans.factory.config.BeanPostProcessor
	 * @see org.springframework.beans.factory.InitializingBean
	 */
	@PostConstruct
	public void init(){
		logger.info("this is order service post construct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("this is order service initializing bean after properties set function!");
	}
}
