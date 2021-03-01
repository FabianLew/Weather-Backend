package com.fabianlewandowski.weather.client;

import lombok.Getter;

@Getter
public class OpenWeatherWeatherDto {
    private OpenWeatherCurrentDto current;
    private OpenWeatherLocationDto location;
}
