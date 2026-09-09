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
@Table(name = "strike_motivo")
public class StrikeMotivo {

    @EmbeddedId
    private StrikeMotivoId id;

    @ManyToOne
    @MapsId("idStrike")
    @JoinColumn(name = "id_strike", nullable = false)
    private Strike strike;

    @ManyToOne
    @MapsId("idMotivo")
    @JoinColumn(name = "id_motivo", nullable = false)
    private MotivoReporte motivo;
}