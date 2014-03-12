package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository PessoaRepository;

	public PessoaServiceImpl() {
	}
	
	@Transactional
	public void insere() {
		PessoaRepository.save(new Pessoa("João", "(88)3452-4567"));
		PessoaRepository.save(new Pessoa("Maria", "(88)3452-4568"));
		PessoaRepository.save(new Pessoa("José", "(88)3452-4569"));
	}

	public List<Pessoa> findAll() {
		List<Pessoa> l = PessoaRepository.findAll();
		return l;
	}

}
