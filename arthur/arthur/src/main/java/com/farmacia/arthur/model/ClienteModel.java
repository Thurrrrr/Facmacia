package com.farmacia.arthur.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TBCLIENTE")
public class ClienteModel {
 @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "cdCliente")
 private Integer cdCliente;

 @Column(name = "nomeCliente")
 private String nomeCliente;

 @Column(name = "cpfCliente")
 private String cpfCliente;

 @Column(name = "telefoneCliente")
 private String telefoneCliente;

 @Column(name = "emailCliente")
 private String emailCliente;
}
