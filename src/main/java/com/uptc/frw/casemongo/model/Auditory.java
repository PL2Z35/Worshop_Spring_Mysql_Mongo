package com.uptc.frw.casemongo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "auditories")
public class Auditory {
    private String idAuditory;
    private String nameTable;
    private String oldRegister;
    private String newRegister;
    private String operation;
    private Date date;
    @PrePersist
    protected void onCreate() {
        date = new Date();
    }
}
