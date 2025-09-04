package com.farmacia.arthur.dto;

import jakarta.validation.constraints.NotBlank;

public record EmpresaDto(
        @NotBlank(message = "Não é possível salvar empresa sem nome.")
        String nomeEmpresa,
        @NotBlank(message = "Não é possível salvar empresa sem cnpj.")
        String cnpjEmpresa,
        @NotBlank(message = "Não é possível salvar empresa sem telefone.")
        String telefoneEmpresa,
        @NotBlank(message = "Não é possível salvar empresa sem endereço.")
        String enderecoEmpresa,
        @NotBlank(message = "Não é possível salvar empresa sem email.")
        String emailEmpresa
) {
}
