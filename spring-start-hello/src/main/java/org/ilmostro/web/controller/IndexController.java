package org.ilmostro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author li.bowei
 */
@Controller
public class IndexController {

	@GetMapping("/index")
	public String index(){
		return "index";
	}

	@GetMapping("/show")
	public String show(Model model){
		model.addAttribute("message", "Hello World!");
		return "show";
	}
}
