package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
