package com.nexteducation.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nexteducation.app.model.service.core.GeneralService;

@Controller
public class TestController {
	
	@Autowired
	GeneralService generalService;
	
	@RequestMapping(value="/index1")
	@ResponseBody
	public String method(){
		return "index1";
	}
	
	@RequestMapping(value="/index2")
	@ResponseBody
	public String method1(){
		
		String response = generalService.checkForClassAClassB();
		return "index2";
	}

}
