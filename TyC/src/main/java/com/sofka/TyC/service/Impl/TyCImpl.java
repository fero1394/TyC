package com.sofka.TyC.service.Impl;

import com.sofka.TyC.models.TyC;
import com.sofka.TyC.repositories.TyCRepository;
import com.sofka.TyC.repositories.UserRepository;
import com.sofka.TyC.service.TyCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TyCImpl implements TyCService {

    @Autowired
    private TyCRepository tycRepository;

    @Override
    public Mono<TyC> save(TyC tyc) {
        return tycRepository.save(tyc);
    }

    @Override
    public Mono<TyC> findById(Long id) {
        return tycRepository.findById(id);
    }

    @Override
    public Flux<TyC> findAll() {
        return tycRepository.findAll();
    }
}
