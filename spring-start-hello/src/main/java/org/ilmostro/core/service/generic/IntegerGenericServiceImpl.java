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
public class IntegerGenericServiceImpl implements GenericService<Integer>{

	private static final Logger logger = LoggerFactory.getLogger(IntegerGenericServiceImpl.class);

	@Override
	public void say(Integer data) {
		logger.info("this is IntegerGenericServiceImpl data:[{}]", data);
	}
}
