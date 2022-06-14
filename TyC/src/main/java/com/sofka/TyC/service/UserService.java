package com.sofka.TyC.service;

import com.sofka.TyC.models.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> save(User user);
}
