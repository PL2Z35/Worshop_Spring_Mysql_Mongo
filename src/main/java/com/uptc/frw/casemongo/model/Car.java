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
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCar;
    private String brand;
    private String cylindrical;
    private String displacement;
    private String registration;
    private double price;
    @Transient
    private long idModel;
    @ManyToOne
    @JoinColumn(name = "ID_MODEL", nullable = false)
    private Model model;
    @OneToMany(mappedBy = "carNew")
    @JsonIgnore
    private List<Bill> newBills;
    @OneToMany(mappedBy = "carOld")
    @JsonIgnore
    private List<Bill> oldBills;

}
