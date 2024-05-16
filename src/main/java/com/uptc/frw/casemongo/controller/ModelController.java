package com.uptc.frw.casemongo.controller;

import com.uptc.frw.casemongo.model.Model;
import com.uptc.frw.casemongo.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/model")
@AllArgsConstructor
public class ModelController {

    private ModelService modelService;

    @GetMapping
    public List<Model> getAll(){
        return modelService.findAll();
    }

    @GetMapping("/{id}")
    public Model getById(@PathVariable long id){
        return modelService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        modelService.deleteById(id);
    }

    @PostMapping
    private Model save(@RequestBody Model model){
        return modelService.save(model);
    }

    @PutMapping("/{id}")
    private Model update(@PathVariable long id, @RequestBody Model model){
        model.setIdModel(id);
        return modelService.save(model);
    }
}
