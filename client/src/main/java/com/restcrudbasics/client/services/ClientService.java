package com.restcrudbasics.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restcrudbasics.client.entities.Client;
import com.restcrudbasics.client.repositories.ClientRepository;

@Service // this annotation will register the class ClientService as a dependency injection component and will be management by spring
public class ClientService {
	
	@Autowired //This annotation will make this instance auto injected (Remember the @Repository annotation in ClientRepository class)
	private ClientRepository repository;
	
	@Transactional(readOnly = true) // Transactional close when make the REST request. Good Practice in Program
	public List<Client> findAll(){
		return repository.findAll(); // When we make repository. we have a tons of methods(FindAll, delete, insert, save)
	}

}
