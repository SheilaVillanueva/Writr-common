package com.example.commons.repository;

import com.example.commons.entity.StrikeMotivo;
import com.example.commons.entity.StrikeMotivoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrikeMotivoRepository extends JpaRepository<StrikeMotivo, StrikeMotivoId> {
}
