package com.example.springbootwebclientdemo.service;

import com.example.springbootwebclientdemo.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonServiceInterface {
        Mono<Person> create(Person person);
        Flux<Person> findAll();
        Mono<Person> findById(Integer id);
}
