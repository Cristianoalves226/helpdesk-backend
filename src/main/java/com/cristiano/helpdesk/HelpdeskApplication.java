package com.cristiano.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cristiano.helpdesk.domain.Chamado;
import com.cristiano.helpdesk.domain.Cliente;
import com.cristiano.helpdesk.domain.Tecnico;
import com.cristiano.helpdesk.domain.enums.Perfil;
import com.cristiano.helpdesk.domain.enums.Prioridade;
import com.cristiano.helpdesk.domain.enums.Status;
import com.cristiano.helpdesk.repositories.ChamadoRepository;
import com.cristiano.helpdesk.repositories.ClienteRepository;
import com.cristiano.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	TecnicoRepository tecnicoRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "731.994.890-79", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvals", "075.300.060-10", "torvals@email.com", "123");
		
		Chamado c1 = new Chamado( null,Prioridade.MEDIA,Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado",  tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
		
		
	}
	
	


}
