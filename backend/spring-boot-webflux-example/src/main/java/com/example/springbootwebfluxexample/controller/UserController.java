package com.example.springbootwebfluxexample.controller;

import com.example.springbootwebfluxexample.model.User;
import com.example.springbootwebfluxexample.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @PostMapping("/create/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        userServiceImpl.createUser(user);
    }

    @GetMapping(value = "/get/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<User> findAll() {
        return userServiceImpl.findAllUsers();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Mono<User>> findUserById(@PathVariable("id") Integer id) {
        Mono<User> employee = userServiceImpl.findByUserId(id);
        return new ResponseEntity<Mono<User>>(employee, employee != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
