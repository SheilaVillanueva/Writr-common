package com.example.commons.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "documento_tag")
public class DocumentoTag {

    @EmbeddedId
    private DocumentoTagId id;

    @ManyToOne
    @MapsId("idDocumento")
    @JoinColumn(name = "id_documento", nullable = false)
    private Documento documento;

    @ManyToOne
    @MapsId("idTag")
    @JoinColumn(name = "id_tag", nullable = false)
    private Tag tag;
}