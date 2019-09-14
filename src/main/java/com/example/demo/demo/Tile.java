package com.example.demo.demo;

import lombok.Data;

import java.util.List;

@Data
public class Tile {
    String name;
    String description;
    List<Country> countries;
}
