package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.Bill;
import com.uptc.frw.casemongo.repository.BillRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BillService {
    private final BillRepository billRepository;

    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }

    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    public Bill findById(long id) {
        return billRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        billRepository.deleteById(id);
    }
}
