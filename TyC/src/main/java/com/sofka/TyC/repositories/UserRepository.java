package com.sofka.TyC.repositories;

import com.sofka.TyC.models.TyC;
import com.sofka.TyC.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
