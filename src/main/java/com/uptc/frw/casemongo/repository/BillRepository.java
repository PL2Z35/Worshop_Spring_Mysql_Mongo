package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BillRepository extends JpaRepository<Bill, Long> {

    @Query("select sum (bho.price) from BillHasOption bho where bho.bill.idBill = ?1")
    long getPriceByBill (long idBill);
}
