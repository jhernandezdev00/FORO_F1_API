package com.proyecto.API_FORO.controller;

import com.proyecto.API_FORO.DTOs.DatosRegistroTopicos;
import com.proyecto.API_FORO.model.DatosTopicos;
import com.proyecto.API_FORO.repository.DatosTopicosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class topicController {

    @Autowired
    private DatosTopicosRepository repository_topics;

    @PostMapping
    public void registerTopics(@RequestBody @Valid DatosRegistroTopicos parameter){
        repository_topics.save(new DatosTopicos(parameter));
    }
}
