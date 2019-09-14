package org.lobosze.api.data;

import lombok.Data;

import java.net.URL;

@Data
public class CityAttraction {
    String name;
    String description;
    double rating;
    URL link;
}
