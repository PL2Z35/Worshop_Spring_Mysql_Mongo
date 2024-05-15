package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.control.Json;
import com.uptc.frw.casemongo.model.Auditory;
import com.uptc.frw.casemongo.model.ENUM.CRUD;
import com.uptc.frw.casemongo.repository.AuditoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuditoryService {

    private final AuditoryRepository auditoryRepository;

    public Object save(String table, Object objectOperation, Object object) {
        Auditory auditory = new Auditory();
        auditory.setOperation(objectOperation == null?String.valueOf(CRUD.INSERT):String.valueOf(CRUD.UPDATE));
        auditory.setNameTable(table);
        auditory.setNewRegister(new Json().toJson(object));
        auditoryRepository.save(auditory);
        return object;
    }

    public void delete(String table, Object object) {
        Auditory auditory = new Auditory();
        auditory.setOperation(CRUD.DELETE.toString());
        auditory.setNameTable(table);
        auditory.setOldRegister(new Json().toJson(object));
        auditoryRepository.save(auditory);
    }

    public List<Auditory> findAll() {
        return auditoryRepository.findAll();
    }
}
