package com.sofka.TyC.service;

import com.sofka.TyC.models.TyC;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TyCService {

    public Mono<TyC> save(TyC tyc);

    public Mono<TyC> findById(String id);

    public Flux<TyC> findAll();
}
