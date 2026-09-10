package com.example.commons.repository;

import com.example.commons.entity.SesionUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SesionUsuarioRepository extends JpaRepository<SesionUsuario, Integer> {
}