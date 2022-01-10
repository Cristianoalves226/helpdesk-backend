package com.cristiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristiano.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
