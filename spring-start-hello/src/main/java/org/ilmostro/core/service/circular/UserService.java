package org.ilmostro.core.service.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author li.bowei
 **/
@Service
public class UserService {

	@Autowired
	private MoneyService service;

	public String information(){
		return "user";
	}

	public String money(){
		return service.getMoney();
	}

}
