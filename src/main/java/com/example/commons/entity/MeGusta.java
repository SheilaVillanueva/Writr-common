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
@Table(name = "me_gusta")
public class MeGusta {

    @EmbeddedId
    private MeGustaId id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("idDocumento")
    @JoinColumn(name = "id_documento", nullable = false)
    private Documento documento;

    @Column(name = "fecha", nullable = false)
    private OffsetDateTime fecha;
}