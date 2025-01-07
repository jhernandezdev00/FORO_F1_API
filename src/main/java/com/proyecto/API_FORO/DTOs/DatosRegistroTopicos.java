package com.proyecto.API_FORO.DTOs;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopicos(
        @NotBlank String title,
        @NotBlank String content,
        @NotNull Categoria category,
        String[] tags,
        @NotNull @Valid DatosUsuariosTopicos author,
        LocalDateTime createdAt) {
}
