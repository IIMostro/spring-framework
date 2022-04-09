package org.ilmostro.core.service.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author li.bowei
 */
@Service
@Lazy
public class StringGenericServiceImpl implements GenericService<String>{

	private static final Logger logger = LoggerFactory.getLogger(StringGenericServiceImpl.class);

	@Override
	public void say(String data) {
		logger.info("this is StringGenericServiceImpl data:[{}]", data);
	}
}
