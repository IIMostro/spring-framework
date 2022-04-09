package org.ilmostro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author li.bowei
 */
@Controller
public class IndexController {

	@GetMapping("/index")
	public String index(){
		return "index";
	}
}
