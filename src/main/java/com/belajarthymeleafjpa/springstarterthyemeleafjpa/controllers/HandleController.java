package com.belajarthymeleafjpa.springstarterthyemeleafjpa.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandleController implements ErrorController {

	private static final String PATH = "/error";
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}
	
	@RequestMapping("/error")
	public String error() {
		return "404error";
	}

}
