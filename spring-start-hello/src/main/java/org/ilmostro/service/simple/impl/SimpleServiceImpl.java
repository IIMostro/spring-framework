package org.ilmostro.service.simple.impl;

import org.ilmostro.service.simple.SimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author li.bowei
 */
@Service
public class SimpleServiceImpl implements SimpleService {

	private static final Logger logger = LoggerFactory.getLogger(SimpleServiceImpl.class);

	@Override
	public void say() {
		logger.info("hello simple service");
	}
}
