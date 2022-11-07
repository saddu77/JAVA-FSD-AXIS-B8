package com.example.springbootwebclientdemo.controller;

import com.example.springbootwebclientdemo.model.Person;
import com.example.springbootwebclientdemo.service.PersonServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonServiceimpl personServiceimpl;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Person> create(@RequestBody Person person){
        return personServiceimpl.create(person);
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<Person> findAll(){
        return personServiceimpl.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Person> findById(@PathVariable("id") Integer id){
      return personServiceimpl.findById(id);
    }
}
