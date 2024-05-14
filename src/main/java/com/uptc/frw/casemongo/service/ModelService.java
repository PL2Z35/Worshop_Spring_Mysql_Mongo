package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.Model;
import com.uptc.frw.casemongo.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;

    public Model save(Model model) {
        return modelRepository.save(model);
    }

    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    public Model findById(Long id) {
        return modelRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        modelRepository.deleteById(id);
    }
}
