package com.example.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "publicidad")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Publicidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicidad;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "asunto", length = 255, nullable = false)
    private String asunto;

    @Column(name = "mensaje", nullable = false)
    private String mensaje;

    @Column(name = "fecha_programada", nullable = false)
    private OffsetDateTime fechaProgramada;
}
