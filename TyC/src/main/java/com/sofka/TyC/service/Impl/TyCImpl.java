package com.sofka.TyC.service.Impl;

import com.sofka.TyC.models.TyC;
import com.sofka.TyC.repositories.TyCRepository;
import com.sofka.TyC.service.TyCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TyCImpl implements TyCService {

    @Autowired
    private TyCRepository tycRepository;

    @Override
    public Mono<TyC> save(TyC tyc) {

        tyc.setDate(LocalDateTime.from(LocalDateTime.now()));

        return tycRepository.save(tyc);

    }

    @Override
    public Mono<TyC> findById(String id) {
        return tycRepository.findById(id);
    }

    @Override
    public Flux<TyC> findAll() {
        return tycRepository.findAll();
    }
}
