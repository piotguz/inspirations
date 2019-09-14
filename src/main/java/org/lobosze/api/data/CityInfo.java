package org.lobosze.api.data;

import lombok.Data;

import java.util.List;

@Data
public class CityInfo {
    List<CityAttraction> attractions;
}
