package com.restcrudbasics.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restcrudbasics.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> { /* Put the entity name and the primary key or Id type, in this case, Long */

}
