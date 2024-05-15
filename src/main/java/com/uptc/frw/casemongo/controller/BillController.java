package com.uptc.frw.casemongo.controller;

import com.uptc.frw.casemongo.model.Bill;
import com.uptc.frw.casemongo.model.CarOption;
import com.uptc.frw.casemongo.service.BillService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill")
@AllArgsConstructor
public class BillController {
    private BillService billService;

    @PostMapping
    private Bill save(@RequestBody Bill bill){
        return billService.save(bill);
    }

    @PutMapping("/{id}")
    private Bill update(@PathVariable long id, @RequestBody Bill bill){
        bill.setIdBill(id);
        return billService.save(bill);
    }

    //@Get id
    //@Get
    //Delete

}
