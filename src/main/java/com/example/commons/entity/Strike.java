package com.example.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "strike")
public class Strike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStrike;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_admin_moderador", nullable = false)
    private Usuario adminModerador;

    @Column(name = "fecha", nullable = false)
    private OffsetDateTime fecha;
}