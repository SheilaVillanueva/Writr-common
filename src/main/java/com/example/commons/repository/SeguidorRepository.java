package com.example.commons.repository;

import com.example.commons.entity.Seguidor;
import com.example.commons.entity.SeguidorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguidorRepository extends JpaRepository<Seguidor, SeguidorId> {
}
