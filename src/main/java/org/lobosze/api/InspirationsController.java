package org.lobosze.api;

import org.lobosze.api.data.City;
import org.lobosze.api.data.CityInfo;
import org.lobosze.api.data.Country;
import org.lobosze.api.data.Tile;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class InspirationsController {

    @GetMapping("/tiles")
    public List<Tile> getTiles() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getClass().getResourceAsStream("data/tiles.json"), new TypeReference<List<Tile>>(){});
    }

    @GetMapping("/cities")
    public List<String> getCities() throws IOException {
        List<String> ret = new ArrayList<>();
        for(Tile tile: getTiles()) {
            for(Country country:tile.getCountries()) {
                for (City city:country.getCities())
                    ret.add(city.getName());
            }
        }
        return ret;
    }

    @GetMapping("/city")
    public CityInfo getCityInfo(@RequestParam(name = "name") String name) {
        return new CityInfo();
    }

}
