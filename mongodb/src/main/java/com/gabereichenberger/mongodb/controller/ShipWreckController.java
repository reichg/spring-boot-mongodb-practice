package com.gabereichenberger.mongodb.controller;

import com.gabereichenberger.mongodb.model.ShipWreck;
import com.gabereichenberger.mongodb.service.ShipWreckService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RestController
public class ShipWreckController {

    // Inject service
    @Autowired
    private ShipWreckService shipWreckService;


    // When navigating to localhost home, redirect to swagger UI
    @GetMapping("/")
    public void home(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    /**
     * 10 items per page with optional page and sortby params.
     * @param page
     * @param sortBy
     * @return 10 shipwreck collection items from mongo db.
     */
    @GetMapping("/shipwrecks")
    public Page<ShipWreck> getAllShipWrecks(@RequestParam Optional<Integer> page, @RequestParam Optional<String> sortBy) {
        return shipWreckService.findAllShipWrecksPaged(page, sortBy);
    }
}
