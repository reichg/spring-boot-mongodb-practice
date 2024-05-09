package com.gabereichenberger.mongodb.service;

import com.gabereichenberger.mongodb.model.ShipWreck;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;


public interface ShipWreckService {

    Page<ShipWreck> findAllShipWrecksPaged(Optional<Integer> page, Optional<String> sortBy);


}
