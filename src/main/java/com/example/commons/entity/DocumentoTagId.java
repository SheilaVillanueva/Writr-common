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
public class DocumentoTagId implements Serializable {

    private Integer idDocumento;

    private Integer idTag;
}