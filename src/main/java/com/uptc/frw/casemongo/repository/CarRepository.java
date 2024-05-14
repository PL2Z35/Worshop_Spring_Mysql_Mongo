package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CarRepository extends JpaRepository<Car, Long> {
}
