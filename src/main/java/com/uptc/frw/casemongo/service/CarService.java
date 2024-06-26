package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.Car;
import com.uptc.frw.casemongo.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final AuditoryService auditoryService;
    private final ModelService modelService;

    public Car save(Car car) {
        car.setModel(modelService.findById(car.getIdModel()));
        return (Car) auditoryService.save("CAR", findById(car.getIdCar()), car, carRepository.save(car));
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        auditoryService.delete("CAR", findById(id));
        carRepository.deleteById(id);
    }

}
