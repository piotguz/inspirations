package com.example.demo;

import com.example.demo.demo.Tile;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class InspirationsController {

    @RequestMapping("/tiles")
    public List<Tile> getTiles() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getClass().getResourceAsStream("data/tiles.json"), new TypeReference<List<Tile>>(){});
    }

    @RequestMapping("/ping")
    public boolean ping() {
        return true;
    }
}
