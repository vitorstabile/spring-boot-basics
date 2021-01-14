package com.restcrudbasics.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restcrudbasics.client.dto.ClientDTO;
import com.restcrudbasics.client.services.ClientService;

@RestController
@RequestMapping(value ="/clients") //the REST route when you make the requisition. Use the plural form of the entity
public class ClientResource {
	
	@Autowired //This annotation will make this instance auto injected (Remember the @Service annotation in ClientService class)
	private ClientService service;
	
	@GetMapping //endpoint GET
	public ResponseEntity<List<ClientDTO>> findAll(){ //This is a endpoint to find all clients
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}") //endpoint GET
	public ResponseEntity<ClientDTO> findById(@PathVariable Long id){ //This is a endpoint to a client by id
		ClientDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
}
