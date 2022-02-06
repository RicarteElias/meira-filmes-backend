package br.com.meiramovies.controller;

import br.com.meiramovies.model.dto.UsuarioDto;
import br.com.meiramovies.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "usuario", produces = "application/json")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping()
    public void salvar(@RequestBody UsuarioDto usuario) {
        usuarioService.salvar(usuario);
    }

    @GetMapping(value = ("{id}"))
    public UsuarioDto buscar(@PathVariable int id) {
        return usuarioService.buscar(id);
    }
}
