package com.example.springbootwebfluxdemo.service;

import com.example.springbootwebfluxdemo.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonServiceInterface {
    void createPerson(Person person);
    Flux<Person> findAllPerson();
    Mono<Person> findByPersonId(Integer id);
}
