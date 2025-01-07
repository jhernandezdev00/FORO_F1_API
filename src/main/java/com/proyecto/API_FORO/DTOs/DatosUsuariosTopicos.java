package com.proyecto.API_FORO.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosUsuariosTopicos(
        @NotBlank String username,
        @NotNull int userId) {
}
