package com.farmacia.arthur.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto (
        @NotBlank(message = "Não é possível salvar funcionário sem nome.")
        String nomeFunc,
        @NotBlank(message = "Não é possível salvar funcionário sem CPF.")
        String cpfFunc,
        @NotBlank(message = "Não é possível salvar funcionário sem telefone.")
        String telefoneFunc,
        @NotBlank(message = "Não é possível salvar funcionário sem e-mail.")
        String emailFunc,
        @NotNull(message = "Não é possível salvar funcionário sem salário.")
        @DecimalMin(value = "815.50", message = "Não é possivel salvar o valor abaixo de meio salário.")
        double salarioFunc,
        @NotBlank(message = "Não é possível salvar funcionário sem cargo.")
        String cargoFunc

){

}
