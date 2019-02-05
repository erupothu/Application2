package com.nexteducation.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nexteducation.app.model.service.core.CollectionService;

@Controller
public class CollectionsController {
	
	@Autowired
	CollectionService collectionService;
	
	@RequestMapping(value="/Streams")
	@ResponseBody
	public String Streams1(){
		
		collectionService.differetWaysofStreams();
		return "streams";
	}
}
