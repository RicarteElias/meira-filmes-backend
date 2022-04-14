package br.com.meiramovies.controller;

import br.com.meiramovies.model.dto.MeiraFilmeDto;
import br.com.meiramovies.service.MeiraFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "meira-filme", produces = "application/json")
public class MeiraFilmeController {


    private MeiraFilmeService meiraFilmeService;

    @Autowired
    public MeiraFilmeController(MeiraFilmeService meiraFilmeService) {
        this.meiraFilmeService = meiraFilmeService;
    }

    @PostMapping("salvar/{id}")
    public String salvar(@RequestBody MeiraFilmeDto filme, @PathVariable Integer id) {
        meiraFilmeService.salvarFilme(filme, id);
        return "Filme adicionado a lista com sucesso!";
    }

}
