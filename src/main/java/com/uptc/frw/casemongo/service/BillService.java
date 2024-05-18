package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.control.Json;
import com.uptc.frw.casemongo.model.Auditory;
import com.uptc.frw.casemongo.model.Bill;
import com.uptc.frw.casemongo.model.CarOption;
import com.uptc.frw.casemongo.model.ENUM.CRUD;
import com.uptc.frw.casemongo.repository.BillRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BillService {
    private final BillRepository billRepository;
    private final AuditoryService auditoryService;
    private final CarService carService;
    private final PersonService personService;

    public Bill save(Bill bill) {
        bill.setPersonClient(personService.findById(bill.getIdpersonClient()));
        bill.setPersonSeller(personService.findById(bill.getIdpersonSeller()));
        bill.setCarNew(carService.findById(bill.getIdcarNew()));
        bill.setCarOld(carService.findById(bill.getIdcarOld()));
        return (Bill) auditoryService.save("BILL", findById(bill.getIdBill()), bill, billRepository.save(bill));
    }

    public List<Bill> findAll() {
        return billRepository.findAll().stream()
                .peek(bill -> bill.setPrice(billRepository.getPriceByBill(bill.getIdBill())))
                .collect(Collectors.toList());
    }

    public Bill findById(long id) {
        Bill bill = billRepository.findById(id).orElse(null);
        if(bill != null){
            bill.setPrice(billRepository.getPriceByBill(bill.getIdBill()));
            return bill;
        }
        return null;
    }

    public void deleteById(Long id) {
        auditoryService.delete("BILL", findById(id));
        billRepository.deleteById(id);
    }
}
