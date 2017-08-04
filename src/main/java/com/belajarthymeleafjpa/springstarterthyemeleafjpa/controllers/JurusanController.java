package com.belajarthymeleafjpa.springstarterthyemeleafjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.belajarthymeleafjpa.springstarterthyemeleafjpa.repository.JurusanRepository;


@Controller
public class JurusanController {
	
	@Autowired
	private JurusanRepository jurusanRepository;
	
	@GetMapping("/jurusan")
	public String getJurusan(ModelMap model) {
		model.put("jurusan", jurusanRepository.findAll());
		return "jurusan/jurusan";
	}
}
