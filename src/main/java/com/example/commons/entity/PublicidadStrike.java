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
@DiscriminatorValue("strike")
public class PublicidadStrike extends Publicidad {

    @ManyToOne
    @JoinColumn(name = "id_strike")
    private Strike strike;
}