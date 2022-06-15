package com.sofka.TyC.service.Impl;

import com.sofka.TyC.models.User;
import com.sofka.TyC.repositories.UserRepository;
import com.sofka.TyC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
    }
}
