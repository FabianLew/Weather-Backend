package com.fabianlewandowski.weather.client;


import com.fabianlewandowski.weather.model.WeatherDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    public static final String API_KEY = "a4fdb52aa1fda691cfa94a9e4a96bcd0";
    public static final String WEB_URL = "http://api.weatherstack.com/";
    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeatherForCity(String city) {
        OpenWeatherWeatherDto openWeatherWeatherDto = callGetMethod("current?access_key=" + API_KEY+ "&query={city}",
                OpenWeatherWeatherDto.class,
                city);

        return WeatherDto.builder().
                temperature(openWeatherWeatherDto.getCurrent().getTemperature()).
                windSpeed(openWeatherWeatherDto.getCurrent().getWind_speed()).
                pressure(openWeatherWeatherDto.getCurrent().getPressure()).
                locationName(openWeatherWeatherDto.getLocation().getName()).
                locationCountry(openWeatherWeatherDto.getLocation().getCountry()).
                build();
    }


    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(WEB_URL + url,
                responseType,
                objects);

    }
}
