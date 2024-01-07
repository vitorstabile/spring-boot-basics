package com.ecommerce.order.resources;

import com.ecommerce.order.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User
                (1000L, "John", "john@gmail.com", "999999", "123456");

        return ResponseEntity.ok().body(user);
    }

}
