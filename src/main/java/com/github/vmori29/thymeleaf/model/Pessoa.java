package com.github.vmori29.thymeleaf.model;

public class Pessoa {
	private long id;
	private String nome;
	private String sexo;
	
	public Pessoa(long id, String nome, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	 
}
