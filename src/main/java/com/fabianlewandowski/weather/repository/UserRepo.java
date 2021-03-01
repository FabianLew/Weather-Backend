package com.fabianlewandowski.weather.repository;

import com.fabianlewandowski.weather.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
