package com.uptc.frw.casemongo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BillHasOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double price;
    @ManyToOne
    @JoinColumn(name = "ID_BILL")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "idCarOption")
    private CarOption carOption;
}
