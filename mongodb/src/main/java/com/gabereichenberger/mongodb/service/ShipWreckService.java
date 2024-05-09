package com.gabereichenberger.mongodb.service;

import com.gabereichenberger.mongodb.model.ShipWreck;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;


public interface ShipWreckService {

    /**
     * Return page of shipwreck collection items with optional page and sortby params.
     * @param page
     * @param sortBy
     * @return  Page of shipwreck collection items
     */
    Page<ShipWreck> findAllShipWrecksPaged(Optional<Integer> page, Optional<String> sortBy);


}
