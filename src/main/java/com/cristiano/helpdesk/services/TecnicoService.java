package com.cristiano.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristiano.helpdesk.domain.Tecnico;
import com.cristiano.helpdesk.domain.dtos.TecnicoDTO;
import com.cristiano.helpdesk.repositories.TecnicoRepository;
import com.cristiano.helpdesk.services.execptions.ObjetcNotFoundException;

@Service
public class TecnicoService {
	@Autowired
	private TecnicoRepository repository;

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
		Tecnico newObj = new Tecnico(objDTO);
		return repository.save(newObj);
	}
}
