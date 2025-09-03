package com.farmacia.arthur.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TBFUNC")
public class FuncionarioModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdFunc")
    private Integer cdFunc;
    @Column(name = "nomeFunc")
    private String nomeFunc;
    @Column(name = "cpfFunc")
    @Pattern(regexp="\\d{11}") private String cpfFunc;
    @Column(name = "telefoneFunc")
    private String telefoneFunc;
    @Column(name = "emailFunc")
    @Email
    private String emailFunc;
    @Column(name = "salarioFunc")
    private double salarioFunc;
    @Column(name = "cargoFunc")
    private String cargoFunc;
    @Column(name = "cdCargoFunc")
    private Integer cdCargoFunc;
}
