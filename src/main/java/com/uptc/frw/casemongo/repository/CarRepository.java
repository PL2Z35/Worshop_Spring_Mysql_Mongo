package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
