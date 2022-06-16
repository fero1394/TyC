package com.sofka.TyC;

import com.sofka.TyC.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class TyCApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(TyCApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TyCApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
