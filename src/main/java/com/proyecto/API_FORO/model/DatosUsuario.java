package com.proyecto.API_FORO.model;

import com.proyecto.API_FORO.DTOs.DatosUsuariosTopicos;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DatosUsuario {
    private int userId;
    private String username;

    public DatosUsuario(DatosUsuariosTopicos author) {
        this.userId = author.userId();
        this.username = author.username();
    }
    public DatosUsuario(){

    }
}
