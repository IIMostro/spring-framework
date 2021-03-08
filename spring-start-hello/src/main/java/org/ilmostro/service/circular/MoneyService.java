package org.ilmostro.service.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author li.bowei
 **/
@Service
public class MoneyService {

	@Autowired
	private UserService userService;

	public void deduct(){
		userService.information();
	}

	public String getMoney(){
		return "0.01";
	}

}
