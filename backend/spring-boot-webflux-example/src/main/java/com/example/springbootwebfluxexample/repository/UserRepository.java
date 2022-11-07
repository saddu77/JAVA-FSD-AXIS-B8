package com.example.springbootwebfluxexample.repository;

import com.example.springbootwebfluxexample.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User,Integer> {

}
