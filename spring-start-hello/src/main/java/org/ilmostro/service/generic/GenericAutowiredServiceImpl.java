package org.ilmostro.service.generic;

import org.springframework.stereotype.Service;

/**
 * @author li.bowei
 */
@Service
public class GenericAutowiredServiceImpl {

	private final GenericService<String> service;

	public GenericAutowiredServiceImpl(GenericService<String> service) {
		this.service = service;
	}

	public void say(){
		service.say("this is one message");
	}
}
