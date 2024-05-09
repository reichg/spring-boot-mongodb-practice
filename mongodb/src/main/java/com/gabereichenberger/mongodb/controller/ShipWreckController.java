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

    @Autowired
    private ShipWreckService shipWreckService;

    @GetMapping("/")
    public void home(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/shipwrecks")
    public Page<ShipWreck> getAllShipWrecks(@RequestParam Optional<Integer> page, @RequestParam Optional<String> sortBy) {
        return shipWreckService.findAllShipWrecksPaged(page, sortBy);
    }
}
