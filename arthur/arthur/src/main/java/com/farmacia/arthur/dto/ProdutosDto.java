package com.farmacia.arthur.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutosDto(
        @NotBlank(message = "Não é possivel salvar o produto sem nome")
        String nmProduto,
        @NotBlank(message = "Não é possivel salvar o produto sem descrição")
        String dsBula,
        @NotNull(message = "Não é possível salvar o produto sem valor")
        @DecimalMin(value = "0.01", message = "Não é possivel salvar o valor abaixo de 0.01")
        double vlProduto
) {

}
