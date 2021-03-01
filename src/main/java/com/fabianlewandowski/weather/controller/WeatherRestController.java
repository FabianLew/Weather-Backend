package com.fabianlewandowski.weather.controller;

import com.fabianlewandowski.weather.model.WeatherDto;
import com.fabianlewandowski.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WeatherRestController {

    WeatherService weatherService;

    @Autowired
    public WeatherRestController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/weather/{name}")
    public WeatherDto getWeatherJsonByCity(@PathVariable String name){
        return weatherService.getWeather(name);
    }
}
