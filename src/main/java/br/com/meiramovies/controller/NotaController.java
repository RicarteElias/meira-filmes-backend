package br.com.meiramovies.controller;

import br.com.meiramovies.model.entity.Nota;
import br.com.meiramovies.repository.NotaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "usuario", produces = "application/json")
public class NotaController {
    private NotaRepository notaRepository;

    @GetMapping(value = ("{id}"))
    public Nota buscar(@PathVariable int id) {
        return notaRepository.findById(id).get();
    }

}
