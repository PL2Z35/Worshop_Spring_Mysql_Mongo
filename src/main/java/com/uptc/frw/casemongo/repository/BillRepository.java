package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
