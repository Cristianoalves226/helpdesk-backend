package com.cristiano.helpdesk.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristiano.helpdesk.domain.Pessoa;
import com.cristiano.helpdesk.domain.Tecnico;
import com.cristiano.helpdesk.domain.dtos.TecnicoDTO;
import com.cristiano.helpdesk.repositories.PessoaRepository;
import com.cristiano.helpdesk.repositories.TecnicoRepository;
import com.cristiano.helpdesk.services.execptions.DataIntegrityViolationException;
import com.cristiano.helpdesk.services.execptions.ObjetcNotFoundException;

@Service
public class TecnicoService {
	@Autowired
	private TecnicoRepository repository;
	@Autowired
	private PessoaRepository pessoaRepository;
	

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjetcNotFoundException("Objeto não encontado Id" + id));
	}

	public List<Tecnico> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Tecnico create(TecnicoDTO objDTO) {
		objDTO.setId(null);
		validaPorCpfEEmail(objDTO);
		Tecnico newObj = new Tecnico(objDTO);
		return repository.save(newObj);
	}

	private void validaPorCpfEEmail(TecnicoDTO objDTO) {
		Optional<Pessoa> obj= pessoaRepository.findByCpf(objDTO.getCpf());
		if (obj.isPresent() && obj.get().getId()!=objDTO.getId()) {
			throw new DataIntegrityViolationException("Cpf já cadastrado no Sistema!");
		}
		
		obj = pessoaRepository.findByEmail(objDTO.getEmail());
		if (obj.isPresent() && obj.get().getId()!=objDTO.getId()) {
			throw new DataIntegrityViolationException("Email já cadastrado no Sistema!");
		}
		
	}

	public Tecnico update(Integer id, TecnicoDTO objDTO) {
		objDTO.setId(id);
		Tecnico oldObj = findById(id);
		validaPorCpfEEmail(objDTO);
		oldObj = new Tecnico(objDTO);
		return repository.save(oldObj);
	}
}
