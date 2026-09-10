package com.example.commons.repository;

import com.example.commons.entity.MeGusta;
import com.example.commons.entity.MeGustaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeGustaRepository extends JpaRepository<MeGusta, MeGustaId> {
}