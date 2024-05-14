package com.uptc.frw.casemongo.repository;

import com.uptc.frw.casemongo.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
