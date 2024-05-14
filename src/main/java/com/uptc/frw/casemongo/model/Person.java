package com.uptc.frw.casemongo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPerson;
    private String address;
    private String numberPhone;
    @OneToMany(mappedBy = "personClient")
    @JsonIgnore
    private List<Bill> clientBills;
    @OneToMany(mappedBy = "personSeller")
    @JsonIgnore
    private List<Bill> sellerBills;
}
