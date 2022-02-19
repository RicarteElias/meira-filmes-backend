package br.com.meiramovies.controller;

import br.com.meiramovies.model.dto.NotaDto;
import br.com.meiramovies.model.dto.SalvarNotaDto;
import br.com.meiramovies.model.entity.Nota;
import br.com.meiramovies.repository.NotaRepository;
import br.com.meiramovies.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "nota", produces = "application/json")
public class NotaController {
    private NotaService notaService;
    @Autowired
    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }
//    @GetMapping(value = ("{id}"))
//    public Nota buscar(@PathVariable int id) {
//        return notaRepository.findById(id).get();
//    }

    @PostMapping("salvar")
    public String salvar(@RequestBody SalvarNotaDto nota) {
        notaService.salvar(nota);
        return "Salvou a nota!";
    }
}
