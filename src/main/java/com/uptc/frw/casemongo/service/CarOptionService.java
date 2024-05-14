package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.CarOption;
import com.uptc.frw.casemongo.repository.CarOptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarOptionService {

    private final CarOptionRepository carOptionRepository;

    public CarOption save(CarOption carOption) {
        return carOptionRepository.save(carOption);
    }

    public List<CarOption> findAll() {
        return carOptionRepository.findAll();
    }

    public CarOption findById(Long id) {
        return carOptionRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        carOptionRepository.deleteById(id);
    }
}
