package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.Auditory;
import com.uptc.frw.casemongo.repository.AuditoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuditoryService {

    private final AuditoryRepository auditoryRepository;

    public Auditory save(Auditory auditory) {
        return auditoryRepository.save(auditory);
    }
}
