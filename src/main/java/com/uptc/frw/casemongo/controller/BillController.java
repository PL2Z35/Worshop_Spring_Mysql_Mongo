package com.uptc.frw.casemongo.controller;

import com.uptc.frw.casemongo.model.Bill;
import com.uptc.frw.casemongo.service.BillService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
@AllArgsConstructor
public class BillController {

    private BillService billService;

    @GetMapping
    public List<Bill> getAll(){
        return billService.findAll();
    }

    @GetMapping("/{id}")
    public Bill getById(@PathVariable long id){
        return billService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        billService.deleteById(id);
    }

    @PostMapping
    private Bill save(@RequestBody Bill bill){
        return billService.save(bill);
    }

    @PutMapping("/{id}")
    private Bill update(@PathVariable long id, @RequestBody Bill bill){
        bill.setIdBill(id);
        return billService.save(bill);
    }
}
