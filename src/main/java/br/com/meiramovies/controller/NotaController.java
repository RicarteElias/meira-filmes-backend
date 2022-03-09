package br.com.meiramovies.controller;

import br.com.meiramovies.model.dto.SalvarNotaDto;
import br.com.meiramovies.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "nota", produces = "application/json")
public class NotaController {
    private NotaService notaService;

    @Autowired
    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }


    @PostMapping("salvar")
    public String salvar(@RequestBody SalvarNotaDto nota) {
        notaService.salvar(nota);
        return "Salvou a nota!";
    }
}
