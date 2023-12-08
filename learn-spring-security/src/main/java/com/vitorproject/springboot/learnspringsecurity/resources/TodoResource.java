package com.vitorproject.springboot.learnspringsecurity.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final List<Todo> TODOS_LIST = List.of(
            new Todo("John", "HR"),
            new Todo("Mike", "IT"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return TODOS_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
        Todo todoByUser = new Todo(null, null);
        for (Todo todo : TODOS_LIST) {
            String user = todo.username();
            if (user.equals(username)) {
                todoByUser = todo;
            }
        }
        return todoByUser;
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser (@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Create {} for {}", todo, username);
    }
}

record Todo (String username, String description) {}
