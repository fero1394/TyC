package com.sofka.TyC.service;

import com.sofka.TyC.models.TyC;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TyCService {

    Mono<TyC> save(TyC tyc);

    Mono<TyC> findById(Long id);

    Flux<TyC> findAll();
}
