package com.fabianlewandowski.weather.client;

import lombok.Getter;

@Getter
public class OpenWeatherCurrentDto {
    private int temperature;
    public int wind_speed;
    private int pressure;
}
