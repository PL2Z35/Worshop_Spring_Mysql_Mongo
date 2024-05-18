package com.uptc.frw.casemongo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBill;
    @Transient
    private double price;
    @ManyToOne
    @JoinColumn(name = "ID_PERSON_CLIENT", nullable = false)
    private Person personClient;
    @ManyToOne
    @JoinColumn(name = "ID_PERSON_SELLER", nullable = false)
    private Person personSeller;
    @ManyToOne
    @JoinColumn(name = "ID_CAR_NEW", nullable = false)
    private Car carNew;
    @ManyToOne
    @JoinColumn(name = "ID_CAR_OLD", nullable = false)
    private Car carOld;
    @Column( updatable = false)
    private Date date;
    @Transient
    private long idpersonClient;
    @Transient
    private long idpersonSeller;
    @Transient
    private long idcarNew;
    @Transient
    private long idcarOld;
    @PrePersist
    protected void onCreate() {
        date = new Date();
    }
    @OneToMany(mappedBy = "bill")
    private List<BillHasOption> billHasOptions;
}
