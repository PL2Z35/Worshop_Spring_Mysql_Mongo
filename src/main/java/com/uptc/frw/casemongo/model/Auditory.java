package com.uptc.frw.casemongo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Auditory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAuditory;
    private String nameTable;
    private String oldRegister;
    private String newRegister;
    private String operation;
    private Date date;

}
