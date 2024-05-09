package com.gabereichenberger.mongodb.repository;

import com.gabereichenberger.mongodb.model.ShipWreck;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipWreckRepository extends MongoRepository<ShipWreck, Long> {
}
