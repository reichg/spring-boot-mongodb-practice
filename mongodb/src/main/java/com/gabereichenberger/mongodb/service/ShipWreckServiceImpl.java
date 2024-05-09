package com.gabereichenberger.mongodb.service;

import com.gabereichenberger.mongodb.model.ShipWreck;
import com.gabereichenberger.mongodb.repository.ShipWreckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShipWreckServiceImpl implements ShipWreckService{

    // Inject repository
    @Autowired
    ShipWreckRepository shipWreckRepository;


    /**
     * Page request to return pages of shipwreck collection items with optional page/sortBy params
     * @param page
     * @param sortBy
     * @return Page of 10 shipwrecks.
     */
    @Override
    public Page<ShipWreck> findAllShipWrecksPaged(Optional<Integer> page, Optional<String> sortBy) {
        return shipWreckRepository.findAll(PageRequest.of(page.orElse(0), 10, Sort.Direction.ASC,sortBy.orElse("recrd")));
    }
}
