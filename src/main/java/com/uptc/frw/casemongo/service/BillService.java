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

@Service
@AllArgsConstructor
public class BillService {
    private final BillRepository billRepository;
    private final AuditoryService auditoryService;

    public Bill save(Bill bill) {
        return (Bill) auditoryService.save("BILL", findById(bill.getIdBill()), billRepository.save(bill));
    }

    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    public Bill findById(long id) {
        return billRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        auditoryService.delete("BILL", findById(id));
        billRepository.deleteById(id);
    }
}
