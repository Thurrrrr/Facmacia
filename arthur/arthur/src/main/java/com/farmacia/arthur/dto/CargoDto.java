package com.farmacia.arthur.dto;

import jakarta.validation.constraints.NotBlank;

public record CargoDto (
        @NotBlank(message = "Não é possível salvar cargo sem nome.")
        String nomeCargo
) {

}
