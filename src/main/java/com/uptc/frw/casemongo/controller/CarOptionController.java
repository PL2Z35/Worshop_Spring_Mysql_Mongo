package com.uptc.frw.casemongo.controller;

import com.uptc.frw.casemongo.model.CarOption;
import com.uptc.frw.casemongo.service.CarOptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carOption")
@AllArgsConstructor
public class CarOptionController {
    private CarOptionService carOptionService;

    @PostMapping
    private CarOption save(@RequestBody CarOption carOption){
        return carOptionService.save(carOption);
    }

    @PutMapping("/{id}")
    private CarOption update(@PathVariable long id, @RequestBody CarOption carOption){
        carOption.setIdCarOption(id);
        return carOptionService.save(carOption);
    }
}
