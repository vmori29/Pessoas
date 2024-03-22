package com.github.vmori29.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.vmori29.thymeleaf.model.Pessoa;
import com.github.vmori29.thymeleaf.model.SexoType;

public class PessoaRepositoryMockup {
	public List<Pessoa> list(){
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L,"Pelé",SexoType.M);
		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L,"Chicoin",SexoType.M);
		
		result.add(pessoa);
		
		result.add(new Pessoa(3L,"Casimiro",SexoType.M));
		
		return result;
	}
}
