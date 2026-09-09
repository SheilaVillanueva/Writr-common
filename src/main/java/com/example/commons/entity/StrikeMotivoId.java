package com.example.commons.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class StrikeMotivoId implements Serializable {

    private Integer idStrike;

    private Integer idMotivo;
}