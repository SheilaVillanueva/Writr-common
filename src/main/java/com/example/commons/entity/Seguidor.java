package com.example.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "seguidor")
public class Seguidor {

    @EmbeddedId
    private SeguidorId id;

    @ManyToOne
    @MapsId("idSeguidor")
    @JoinColumn(name = "id_seguidor", nullable = false)
    private Usuario seguidor;

    @ManyToOne
    @MapsId("idSeguido")
    @JoinColumn(name = "id_seguido", nullable = false)
    private Usuario seguido;

    @Column(name = "fecha_inicio", nullable = false)
    private OffsetDateTime fechaInicio;

    @Column(name = "estado", length = 20, nullable = false)
    private String estado;
}
