package com.example.commons.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


import java.util.UUID;
import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private UUID idUsuario;

    @Column(name = "nombre", length = 120, nullable = false)
    private String nombre;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_helper_supervisor")
    private Usuario helperSupervisor;

     @Column(name = "es_privada", nullable = false)
    private Boolean esPrivada;

    @Column(name = "comentarios_habilitados", nullable = false)
    private Boolean comentariosHabilitados;

    @Column(name = "cantidad_strikes", nullable = false)
    private Integer cantidadStrikes;

    @Column(name = "estado_cuenta", length = 30, nullable = false)
    private String estadoCuenta;

    @Column(name = "fecha_marcado_eliminacion")
    private OffsetDateTime fechaMarcadoEliminacion;

    @Column(name = "fecha_registro", nullable = false)
    private OffsetDateTime fechaRegistro;
}
