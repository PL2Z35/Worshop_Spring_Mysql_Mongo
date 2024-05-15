package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.control.Json;
import com.uptc.frw.casemongo.model.Auditory;
import com.uptc.frw.casemongo.model.CarOption;
import com.uptc.frw.casemongo.model.ENUM.CRUD;
import com.uptc.frw.casemongo.repository.CarOptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarOptionService {

    private final CarOptionRepository carOptionRepository;
    private final AuditoryService auditoryService;

    public CarOption save(CarOption carOption) {
        return (CarOption) auditoryService.save("CAR_OPTION", findById(carOption.getIdCarOption()), carOptionRepository.save(carOption));
    }

    public List<CarOption> findAll() {
        return carOptionRepository.findAll();
    }

    public CarOption findById(Long id) {
        return carOptionRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        auditoryService.delete("CAR_OPTION", findById(id));
        carOptionRepository.deleteById(id);
    }
}
