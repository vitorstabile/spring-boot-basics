package com.restcrudbasics.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restcrudbasics.client.entities.Client;

@Repository //this annotation will register the class ClientRepository as a dependency injection component and will be management by spring
public interface ClientRepository extends JpaRepository<Client, Long> { /* Put the entity name and the primary key or Id type, in this case, Long */

}
