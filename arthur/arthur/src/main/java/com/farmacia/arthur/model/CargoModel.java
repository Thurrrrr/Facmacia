package com.farmacia.arthur.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TBCARGO")

public class CargoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdCargo")
    private Integer cdCargo;
    @Column(name = "nomeCargo")
    private String nomeCargo;
}