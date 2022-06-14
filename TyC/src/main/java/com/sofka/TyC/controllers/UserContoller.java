package com.sofka.TyC.controllers;

import com.sofka.TyC.service.TyCService;
import com.sofka.TyC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserContoller {

    @Autowired
    private UserService userService;

    @Autowired
    private TyCService tycService;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping()





}
