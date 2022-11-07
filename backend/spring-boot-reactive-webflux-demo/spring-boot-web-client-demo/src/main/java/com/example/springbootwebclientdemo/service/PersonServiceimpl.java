package com.example.springbootwebclientdemo.service;

import com.example.springbootwebclientdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class PersonServiceimpl implements PersonServiceInterface{
    @Autowired
    WebClient webClient;
    @Override
    public Mono<Person> create(Person person) {
        return webClient.post()
                .uri("/create/person")
                .body(Mono.just(person),Person.class)
                .retrieve()
                .bodyToMono(Person.class)
                .timeout(Duration.ofMillis(10_000));
    }
    @Override
    public Flux<Person> findAll() {
        return webClient.get()
                .uri("/get/all")
                .retrieve()
                .bodyToFlux(Person.class)
                .timeout(Duration.ofMillis(10_000));
    }
    @Override
    public Mono<Person> findById(Integer id) {
        return webClient.get()
                .uri("/get/" + id)
                .retrieve()
                .bodyToMono(Person.class);
    }
}
