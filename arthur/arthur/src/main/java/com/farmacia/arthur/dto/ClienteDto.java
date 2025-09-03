package com.farmacia.arthur.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteDto(
        @NotBlank(message = "Não é possível salvar um cliente sem nome.")
        String nomeCliente,
        @NotBlank(message = "Não é possível salvar um cliente sem cpf.")
        String cpfCliente,
        @NotBlank(message = "Não é possível salvar um cliente sem telefone.")
        String telefoneCliente,
        @NotBlank(message = "Não é possível salvar um cliente sem e-mail.")
        String emailCliente
){

}
