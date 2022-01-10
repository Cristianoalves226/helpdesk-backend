package com.cristiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristiano.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
