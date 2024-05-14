package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person, Long> {
}
