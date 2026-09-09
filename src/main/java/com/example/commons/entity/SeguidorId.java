package com.example.commons.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class SeguidorId implements Serializable {

    private UUID idSeguidor;

    private UUID idSeguido;
}