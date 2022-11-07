package com.example.springbootwebfluxexample.service;

import com.example.springbootwebfluxexample.model.User;
import com.example.springbootwebfluxexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User u) {
    userRepository.save(u).subscribe();
    }

    @Override
    public Mono<User> findByUserId(Integer id) {

        return userRepository.findById(id);
    }

    @Override
    public Flux<User> findAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public Mono<User> updateUser(User u) {
        return null;
    }

    @Override
    public Mono<Void> deleteUser(Integer id) {
        return null;
    }
}
