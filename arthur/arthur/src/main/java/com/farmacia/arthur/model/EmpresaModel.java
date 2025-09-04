package com.farmacia.arthur.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TBEMPRESA")
public class EmpresaModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdEmpresa")
    private Integer cdEmpresa;
    @Column(name = "nomeEmpresa")
    private String nomeEmpresa;
    @Column(name = "cnpjEmpresa")
    private String cnpjEmpresa;
    @Column(name = "telefoneEmpresa")
    private String telefoneEmpresa;
    @Column(name = "enderecoEmpresa")
    private String enderecoEmpresa;
    @Column(name = "emailEmpresa")
    @Email private String emailEmpresa;
}
