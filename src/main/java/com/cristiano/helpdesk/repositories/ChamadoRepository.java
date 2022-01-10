package com.cristiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristiano.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
