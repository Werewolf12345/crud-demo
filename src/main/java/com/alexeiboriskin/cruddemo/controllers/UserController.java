package com.alexeiboriskin.cruddemo.controllers;

import com.alexeiboriskin.cruddemo.domain.User;
import com.alexeiboriskin.cruddemo.services.UserService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public HttpEntity<Set<User>> getAllUsers() {

        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);

    }

    @GetMapping(value = "/{id:[\\d]+}")
    public HttpEntity<User> getUserById(@PathVariable Long id) {

        return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);

    }
}
