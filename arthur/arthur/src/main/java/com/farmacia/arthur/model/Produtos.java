package com.farmacia.arthur.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Table(name = "TBPRODUTOS")
public class Produtos {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdProduto")
    private Integer cdProduto;
    @Column(name = "nmProduto")
    private String nmProduto;
    @Column (name = "dsBula")
    private Integer dsBula;
    @Column(name = "vlProduto")
    private  double vlProduto;
}
