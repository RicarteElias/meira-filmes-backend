package br.com.meiramovies.service;

import br.com.meiramovies.model.dto.UsuarioDto;
import br.com.meiramovies.model.entity.Usuario;
import br.com.meiramovies.model.mapper.UsuarioMapper;
import br.com.meiramovies.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioMapper usuarioMapper;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    public void salvar(UsuarioDto usuarioDto) {
        usuarioRepository.save(usuarioMapper.toEntity(usuarioDto));
    }

    public UsuarioDto buscar(int id) {
        return usuarioMapper.toDTO(usuarioRepository.findById(id).orElseGet(Usuario::new));
    }

    public void editar(UsuarioDto usuarioDto) {
        usuarioRepository.findById(usuarioDto.getId()).orElseGet(Usuario::new);
    }

}
