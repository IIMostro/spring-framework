package org.ilmostro.service.aspect;

import org.springframework.stereotype.Service;

/**
 * @author li.bowei
 */
@Service
public class SimpleAspectService {

	public void say(){
		System.out.println("hello world!");
	}
}
