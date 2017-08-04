package com.belajarthymeleafjpa.springstarterthyemeleafjpa.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.belajarthymeleafjpa.springstarterthyemeleafjpa.model.Siswa;
import com.belajarthymeleafjpa.springstarterthyemeleafjpa.repository.JurusanRepository;
import com.belajarthymeleafjpa.springstarterthyemeleafjpa.repository.SiswaRepository;

@Controller
public class SiswaController {

	private List<String> kelamin = Arrays.asList("Laki-Laki","Perempuan");
	
	@Autowired
	private SiswaRepository siswaRepository;
	
	@Autowired
	private JurusanRepository jurusanRepository;
	
	@GetMapping("/siswa")
	public String getSiswa(ModelMap model) {
		model.put("siswa", siswaRepository.findAll());
		return "mahasiswa/siswa";
	}
	
	@GetMapping("/siswa/tambah")
	public String tambahSiswa(ModelMap model) {
		model.put("siswa", new Siswa());
		model.put("jurusan", jurusanRepository.findAll());
		model.put("kelamin", kelamin);
		
		return "mahasiswa/siswaform";
	}
	
	@PostMapping("/siswa/save")
	public String saveSiswa(Siswa siswa) {
		siswaRepository.save(siswa);
		return "redirect:/siswa";
	}
	
	@GetMapping("/siswa/ubah/{id}")
	public String ubahSiswa(ModelMap model,@PathVariable int id){
		model.put("siswa", siswaRepository.findOne(id));
		model.put("jurusan", jurusanRepository.findAll());
		model.put("kelamin", kelamin);
		return "mahasiswa/siswaform";
	}
	
	@GetMapping("/siswa/hapus/{id}")
	public String hapusSiswa(@PathVariable int id) {
		siswaRepository.delete(id);
		return "redirect:/siswa";
	}
}
