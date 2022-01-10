package com.cristiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristiano.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
