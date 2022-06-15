package com.sofka.TyC.repositories;

import com.sofka.TyC.models.TyC;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TyCRepository extends ReactiveMongoRepository<TyC, String> {
}
