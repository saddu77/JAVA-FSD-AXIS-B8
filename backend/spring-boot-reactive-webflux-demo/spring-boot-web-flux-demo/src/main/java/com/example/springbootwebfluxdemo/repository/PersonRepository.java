package com.example.springbootwebfluxdemo.repository;

import com.example.springbootwebfluxdemo.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person,Integer> {
}
