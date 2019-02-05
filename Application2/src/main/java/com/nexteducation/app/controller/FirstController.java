package com.nexteducation.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping(value="/vinny")
	public String example(){
		return "welcome Vinny";
	}
}
