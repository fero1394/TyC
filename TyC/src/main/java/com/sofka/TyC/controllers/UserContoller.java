package com.sofka.TyC.controllers;

import com.sofka.TyC.models.TyC;
import com.sofka.TyC.service.TyCService;
import com.sofka.TyC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserContoller {

    @Autowired
    private UserService userService;

    @Autowired
    private TyCService tycService;

    @GetMapping("/")
    private Flux<TyC> findAll(){
        return tycService.findAll();
    }

    @GetMapping("/{id}")
    private Mono<TyC> findById(@PathVariable("id")Long id){
        return tycService.findById(id);
    }

    @PostMapping("create")
    private Mono<TyC> create(@RequestBody TyC tyc){
        return tycService.save(tyc);
    }


}
