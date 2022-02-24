package org.ilmostro.lifecycle;

import org.ilmostro.service.simple.SimpleService;
import org.ilmostro.service.simple.impl.SimpleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author li.bowei
 */
@Component
public class ObjectMapperUtils implements ApplicationContextAware, InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(ObjectMapperUtils.class);

	private volatile static SimpleService service;

	private ApplicationContext context;

	static{
		logger.info("static function service:{}", Objects.hashCode(service));
		if(Objects.isNull(service)){
			service = new SimpleServiceImpl();
		}
		logger.info("static function after value service:{}", Objects.hashCode(service));
	}

	{
		logger.info("function service:{}", Objects.hashCode(service));
	}

	public ObjectMapperUtils() {
		logger.info("construction service:{}", Objects.hashCode(service));
	}

	public void say(){
		service.say();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		service = context.getBean(SimpleService.class);
		logger.info("after properties set service:{}", Objects.hashCode(service));
	}

	@Override
	public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}
