package com.restcrudbasics.client.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restcrudbasics.client.dto.ClientDTO;
import com.restcrudbasics.client.entities.Client;
import com.restcrudbasics.client.repositories.ClientRepository;
import com.restcrudbasics.client.services.exceptions.ResourceNotFoundException;

@Service // this annotation will register the class ClientService as a dependency injection component and will be management by spring
public class ClientService {
	
	@Autowired //This annotation will make this instance auto injected (Remember the @Repository annotation in ClientRepository class)
	private ClientRepository repository;
	
	@Transactional(readOnly = true) // Transactional close when make the REST request. Good Practice in Program
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){		
		Page<Client> list = repository.findAll(pageRequest); // We have to convert this Client list to ClientDTO list.
		return list.map(x -> new ClientDTO(x)); // Use Functional program
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = repository.getOne(id);
			entity.setName(dto.getName());
			entity.setCpf(dto.getCpf());
			entity.setIncome(dto.getIncome());
			entity.setBirthDate(dto.getBirthDate());
			entity.setChildren(dto.getChildren());
			entity = repository.save(entity);
			return new ClientDTO(entity);
		}
		catch(EntityNotFoundException e){
			throw new ResourceNotFoundException("Id not found " + id);
		}
		
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
		
	}

}
