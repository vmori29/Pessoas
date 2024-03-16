package com.github.vmori29.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.vmori29.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {
	public List<Pessoa> list(){
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L,"Pelé","M");
		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L,"Chicoin","M");
		
		result.add(pessoa);
		
		result.add(new Pessoa(3L,"Casimiro","M"));
		
		return result;
	}
}
