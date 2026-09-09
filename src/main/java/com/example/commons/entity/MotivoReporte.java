package com.example.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "motivo_reporte")
public class MotivoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMotivo;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;
}