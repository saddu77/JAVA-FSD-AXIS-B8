package com.example.springbootwebfluxexample.service;

import com.example.springbootwebfluxexample.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserServiceInterface {
    void createUser(User u);

    Mono<User> findByUserId(Integer id);

    Flux<User> findAllUsers();

    Mono<User> updateUser(User u);

    Mono<Void> deleteUser(Integer id);

}
