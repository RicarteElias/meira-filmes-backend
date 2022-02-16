package br.com.meiramovies.controller;

import br.com.meiramovies.model.dto.UsuarioDto;
import br.com.meiramovies.service.EmailService;
import br.com.meiramovies.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "usuario", produces = "application/json")
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final EmailService emailService;

    public UsuarioController(UsuarioService usuarioService, EmailService emailService) {
        this.usuarioService = usuarioService;
        this.emailService = emailService;
    }

    @PostMapping()
    public void salvar(@RequestBody UsuarioDto usuario) {
        usuarioService.salvar(usuario);
    }

    @PostMapping("/editar")
    public String editar(@RequestBody UsuarioDto usuario) {
        usuarioService.editar(usuario);
        return "Cadastro realizado com sucesso!";
    }

    @GetMapping(value = ("{id}"))
    public UsuarioDto buscar(@PathVariable int id) {
        return usuarioService.buscar(id);
    }

}
