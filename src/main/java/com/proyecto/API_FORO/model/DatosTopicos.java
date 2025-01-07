package com.proyecto.API_FORO.model;

import com.proyecto.API_FORO.DTOs.Categoria;
import com.proyecto.API_FORO.DTOs.DatosRegistroTopicos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Table(name = "topics")
@Entity(name = "DatosTopicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class DatosTopicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @Enumerated(EnumType.STRING)
    private Categoria category;
    private String[] tags;
    @Embedded
    private DatosUsuario autor;
    private LocalDateTime createdAt;

    public DatosTopicos(DatosRegistroTopicos data){
        this.title = data.title();
        this.content = data.content();
        this.category = data.category();
        this.tags = data.tags();
        this.autor = new DatosUsuario(data.author());
        this.createdAt = data.createdAt();
    }
}
