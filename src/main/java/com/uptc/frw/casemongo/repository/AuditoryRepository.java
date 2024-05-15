package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Auditory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditoryRepository extends MongoRepository<Auditory, Long> {
}
