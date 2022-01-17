package com.cristiano.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristiano.helpdesk.domain.Chamado;
import com.cristiano.helpdesk.repositories.ChamadoRepository;
import com.cristiano.helpdesk.services.execptions.ObjetcNotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;

	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjetcNotFoundException("Objeto não encontrado ID " + id));
	}

	public List<Chamado> findAll() {
		return repository.findAll();
	}

}
