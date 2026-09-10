package com.example.commons.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("promocion_libro")
public class PublicidadLibro extends Publicidad {

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private Documento documento;
}