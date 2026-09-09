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
@Table(name = "lista_lectura_usuario")
public class ListaLecturaUsuario {

    @EmbeddedId
    private ListaLecturaUsuarioId id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("idLista")
    @JoinColumn(name = "id_lista", nullable = false)
    private Lista lista;

    @Column(name = "fecha_union", nullable = false)
    private OffsetDateTime fechaUnion;
}