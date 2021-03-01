package com.fabianlewandowski.weather.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDto {
    public String locationName;
    public String locationCountry;
    public int temperature;
    public int windSpeed;
    public int pressure;
}
