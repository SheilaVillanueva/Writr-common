package com.example.commons.repository;

import com.example.commons.entity.UsuarioInteres;
import com.example.commons.entity.UsuarioInteresId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioInteresRepository extends JpaRepository<UsuarioInteres, UsuarioInteresId> {
}