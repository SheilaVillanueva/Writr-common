package com.example.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "configuracion")
public class Configuracion {

    @Id
    @Column(name = "clave", length = 80)
    private String clave;

    @Column(name = "valor", nullable = false)
    private String valor;
}