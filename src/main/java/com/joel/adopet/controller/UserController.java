package com.joel.adopet.controller;

import com.joel.adopet.model.User;
import com.joel.adopet.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> list() {
        return repository.findAll();
    }

    @GetMapping("/{email}")
    public List<User> listUserByEmail(@PathVariable String email){
        return repository.findByEmail(email);
    }

}
