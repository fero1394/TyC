package com.sofka.TyC.controllers;

import com.sofka.TyC.models.TyC;
import com.sofka.TyC.models.User;
import com.sofka.TyC.service.TyCService;
import com.sofka.TyC.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserContoller {
    @Autowired
    private TyCService tycService;

    @Autowired
    private UserService userService;

    @GetMapping("/tyc")
    private Flux<TyC> findAll(){
        return tycService.findAll();
    }

    @GetMapping("/{id}")
    private Mono<TyC> findById(@PathVariable("id")Long id){
        return tycService.findById(id);
    }

    @PostMapping("/createTyC")
    private Mono<TyC> createTyC(@RequestBody TyC tyc){
        return tycService.save(tyc);
    }

    @PostMapping("/createUser")
    private Mono<User> createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/users")
    private Flux<User> AllUsers(){
        return userService.findAll();
    }

    /*
    @GetMapping("/ultimosTyC")
    private Mono<TyC> ultimo(){
        return tycService.obtenerUltimo();
    }

     */

}
