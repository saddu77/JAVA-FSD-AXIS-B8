package com.example.springbootwebfluxdemo.service;


import com.example.springbootwebfluxdemo.model.Person;
import com.example.springbootwebfluxdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonServiceInterface{

    @Autowired
    PersonRepository personRepository;

    @Override
    public void createPerson(Person person) {
        personRepository.save(person).subscribe();
    }

    @Override
    public Flux<Person> findAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Mono<Person> findByPersonId(Integer id) {
        return personRepository.findById(id);
    }
}
