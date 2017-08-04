package com.belajarthymeleafjpa.springstarterthyemeleafjpa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "th_jurusan")
public class Jurusan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length=30)
	private String jurusan;

	@OneToMany(mappedBy = "jurusanRelasi")
	private List<Siswa> siswas = new ArrayList<Siswa>();
	
	public Jurusan() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public List<Siswa> getSiswas() {
		return siswas;
	}

	public void setSiswas(List<Siswa> siswas) {
		this.siswas = siswas;
	}

	
	
	
}
