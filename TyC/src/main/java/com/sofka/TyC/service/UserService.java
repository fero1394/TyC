package com.sofka.TyC.service;


import com.sofka.TyC.models.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    public Mono<User> save(User user);

    public Flux<User> findAll();
}
