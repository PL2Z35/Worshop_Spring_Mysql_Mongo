package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Auditory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface AuditoryRepository extends MongoRepository<Auditory, String> {
}
