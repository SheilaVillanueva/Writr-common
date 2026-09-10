package com.example.commons.repository;

import com.example.commons.entity.ListaLecturaUsuario;
import com.example.commons.entity.ListaLecturaUsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaLecturaUsuarioRepository extends JpaRepository<ListaLecturaUsuario, ListaLecturaUsuarioId> {
}
