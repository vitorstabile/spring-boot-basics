package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
