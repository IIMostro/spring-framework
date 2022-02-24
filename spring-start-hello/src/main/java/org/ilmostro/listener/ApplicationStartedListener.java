package org.ilmostro.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author li.bowei
 */
@Component
public class ApplicationStartedListener implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationStartedListener.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		logger.info("application context refreshed...");
	}
}
