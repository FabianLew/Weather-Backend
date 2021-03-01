package com.fabianlewandowski.weather;

import com.fabianlewandowski.weather.model.User;
import com.fabianlewandowski.weather.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.stream.Stream;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepo userRepo) {
        return args -> {
            Stream.of("Adamex", "Pierro", "Dragon").forEach(login -> {
                User user = new User(login, login.toLowerCase() + "123");
                userRepo.save(user);
            });
        };
    }
}
