package com.proyecto.API_FORO.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosUsuariosTopicos(
        @NotBlank @Pattern(regexp = "^[a-zA-Z0-9_]+$") String username,
        @NotNull int userId) {
}
