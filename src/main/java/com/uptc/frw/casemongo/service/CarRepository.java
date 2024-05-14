package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarRepository {
    private final CarRepository carRepository;

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(Long id) {
        return carRepository.findById(id);
    }

    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

}
