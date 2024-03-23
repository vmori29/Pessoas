package com.github.vmori29.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.vmori29.thymeleaf.model.Pessoa;
import com.github.vmori29.thymeleaf.repository.PessoaRepositoryMockup;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	private PessoaRepositoryMockup pessoaRepository = new PessoaRepositoryMockup();
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String lista(Model model) {
		List<Pessoa> pessoas = pessoaRepository.list();
		model.addAttribute( "pessoas" , pessoas);
		return "pessoa/lista.html";
	}
	
}
