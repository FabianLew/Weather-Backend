package com.fabianlewandowski.weather.service;

import com.fabianlewandowski.weather.client.WeatherClient;
import com.fabianlewandowski.weather.client.OpenWeatherWeatherDto;
import com.fabianlewandowski.weather.model.WeatherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherService {
    private final WeatherClient weatherClient;

    @Autowired
    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public WeatherDto getWeather(String city){
        return weatherClient.getWeatherForCity(city);
    }
}
