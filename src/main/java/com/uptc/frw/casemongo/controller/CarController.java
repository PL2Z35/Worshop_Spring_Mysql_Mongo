package com.uptc.frw.casemongo.controller;

import com.uptc.frw.casemongo.model.Car;
import com.uptc.frw.casemongo.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@AllArgsConstructor
public class CarController {

    private CarService carService;

    @GetMapping
    public List<Car> getAll(){
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable long id){
        return carService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        carService.deleteById(id);
    }

    @PostMapping
    private Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @PutMapping("/{id}")
    private Car update(@PathVariable long id, @RequestBody Car car){
        car.setIdCar(id);
        return carService.save(car);
    }

}
