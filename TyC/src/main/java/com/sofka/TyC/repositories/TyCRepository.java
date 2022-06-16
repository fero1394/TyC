package com.sofka.TyC.repositories;

import com.sofka.TyC.models.TyC;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface TyCRepository extends ReactiveMongoRepository<TyC, Long> {

    @Query("{$natural:1}")
    public Mono<TyC> obtenerUltimo();
}
