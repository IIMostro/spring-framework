package org.ilmostro.web.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.lang.NonNull;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author li.bowei
 */
public class MvcGlobalXmlReaderInterceptor implements HandlerInterceptor {


	private static final Logger logger = LoggerFactory.getLogger(MvcXmlReaderInterceptor.class);

	@Override
	public boolean preHandle(@NonNull HttpServletRequest request,
			@NonNull HttpServletResponse response,
			@NonNull Object handler) {
		logger.info("this is mvc global xml configuration interceptor");
		return true;
	}
}
