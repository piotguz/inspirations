package org.lobosze.api;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.lobosze.api.data.CityInfo;
import org.lobosze.api.data.Tile;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@CrossOrigin
public class InspirationsController {

    @GetMapping("/tiles")
    public List<Tile> getTiles() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getClass().getResourceAsStream("data/tiles.json"), new TypeReference<List<Tile>>(){});
    }

    @GetMapping("/city")
    public CityInfo getCityInfo(@RequestParam(name = "name") String name) {
        return new CityInfo();
    }

}
