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
@Table(name = "reporte_documento")
public class ReporteDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReporte;

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private Documento documento;

    @ManyToOne
    @JoinColumn(name = "id_comentario")
    private Comentario comentario;

    @ManyToOne
    @JoinColumn(name = "id_usuario_reporta", nullable = false)
    private Usuario usuarioReporta;

    @ManyToOne
    @JoinColumn(name = "id_motivo", nullable = false)
    private MotivoReporte motivo;

    @Column(name = "fecha", nullable = false)
    private OffsetDateTime fecha;

    @Column(name = "estado", length = 20, nullable = false)
    private String estado;
}