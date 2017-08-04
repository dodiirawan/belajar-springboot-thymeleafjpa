package com.belajarthymeleafjpa.springstarterthyemeleafjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="th_siswa")
public class Siswa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length=10)
	private String nim;
	
	@Column(length = 30)
	private String nama;

	@Column(length = 15)
	private String kelamin;
	
	@ManyToOne
	@JoinColumn(name="id_jurusan")
	private Jurusan jurusanRelasi;
	
	public Siswa() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKelamin() {
		return kelamin;
	}

	public void setKelamin(String kelamin) {
		this.kelamin = kelamin;
	}

	public Jurusan getJurusanRelasi() {
		return jurusanRelasi;
	}

	public void setJurusanRelasi(Jurusan jurusanRelasi) {
		this.jurusanRelasi = jurusanRelasi;
	}

	
	
}
