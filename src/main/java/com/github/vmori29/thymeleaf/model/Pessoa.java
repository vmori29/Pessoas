package com.github.vmori29.thymeleaf.model;

public class Pessoa {
	private long id;
	private String nome;
	private SexoType sexo;
	
	public Pessoa(long id, String nome, SexoType sexo) {
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
	public SexoType getSexo() {
		return sexo;
	}
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	 
}
