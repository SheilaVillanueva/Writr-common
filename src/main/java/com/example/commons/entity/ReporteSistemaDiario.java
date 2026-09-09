package com.example.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reporte_sistema_diario")
public class ReporteSistemaDiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReporte;

    @Column(name = "fecha", nullable = false, unique = true)
    private LocalDate fecha;

    @Column(name = "nuevos_usuarios", nullable = false)
    private Integer nuevosUsuarios;

    @Column(name = "usuarios_unicos", nullable = false)
    private Integer usuariosUnicos;

    @Column(name = "promedio_online", precision = 10, scale = 2, nullable = false)
    private BigDecimal promedioOnline;

    @Column(name = "peak_online", nullable = false)
    private Integer peakOnline;

    @Column(name = "documentos_creados", nullable = false)
    private Integer documentosCreados;
}
