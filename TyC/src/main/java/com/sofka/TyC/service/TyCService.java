package com.sofka.TyC.service;

import com.sofka.TyC.models.TyC;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicLong;

public interface TyCService {

    public Mono<TyC> save(TyC tyc);

    public Mono<TyC> findById(Long id);

    public Flux<TyC> findAll();

    /*
    public Mono<TyC> obtenerUltimo();

     */
}
