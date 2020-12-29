package com.restcrudbasics.client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restcrudbasics.client.entities.Client;

@RestController
@RequestMapping(value ="/clients") //the REST route when you make the requisition. Use the plural form of the entity
public class ClientResource {
	
	@GetMapping //endpoint GET
	public ResponseEntity<List<Client>> findAll(){ //This is a endpoint to find a client by id
		List<Client> list = new ArrayList<>(); //to test the request, we gonna make a list
		list.add(new Client(1L, "João", "222.222.222-22", 2000.0, Instant.parse("2017-02-03T11:35:30.00Z"), 2)); 
		list.add(new Client(2L, "Maria", "333.333.333-33", 3000.0, Instant.parse("2017-02-03T11:35:30.00Z"), 3));
		list.add(new Client(3L, "Jose", "444.444.444-44", 4000.0, Instant.parse("2017-02-03T11:35:30.00Z"), 4));
		return ResponseEntity.ok().body(list);
	}
	
}
