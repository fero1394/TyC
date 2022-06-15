package com.sofka.TyC.controllers;

import com.sofka.TyC.models.TyC;
import com.sofka.TyC.service.TyCService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class UserContoller {
    @Autowired
    private TyCService tycService;

    @GetMapping("/")
    private Flux<TyC> findAll(){
        return tycService.findAll();
    }

    @GetMapping("/{id}")
    private Mono<TyC> findById(@PathVariable("id")String id){
        return tycService.findById(id);
    }

    @PostMapping("/create")
    private Mono<TyC> create(@RequestBody TyC tyc){
        return tycService.save(tyc);
    }

}
