package br.com.meiramovies.controller;

import br.com.meiramovies.model.dto.MeiraFilmeDto;
import br.com.meiramovies.model.entity.MeiraFilme;
import br.com.meiramovies.model.request.FilterMeiraFilmeRequest;
import br.com.meiramovies.service.MeiraFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping()
    public List<MeiraFilmeDto> buscarFilmes() {
        return meiraFilmeService.buscarFilmes();
    }

    @GetMapping("filtro")
    public List<MeiraFilme> buscarPorFiltro(FilterMeiraFilmeRequest filter) {
        return meiraFilmeService.buscarFilmesFiltro(filter);
    }

    @DeleteMapping("{id}")
    public String deletarFilme(@PathVariable Integer id) {
        meiraFilmeService.deletarFilme(id);
        return "Filme excluído com sucesso!";
    }

}
