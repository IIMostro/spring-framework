package org.ilmostro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li.bowei
 */
@RestController
public class DemoController {

	@GetMapping("/sample")
	public String sample(){
		return "hello";
	}
}
