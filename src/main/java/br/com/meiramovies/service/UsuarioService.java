package br.com.meiramovies.service;

import br.com.meiramovies.exceptions.NegocioException;
import br.com.meiramovies.model.dto.UsuarioDto;
import br.com.meiramovies.model.entity.Usuario;
import br.com.meiramovies.model.mapper.UsuarioMapper;
import br.com.meiramovies.model.request.LoginRequest;
import br.com.meiramovies.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

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
        Usuario u = usuarioRepository.findUsuarioByEmail(usuarioDto.getEmail());
        if (!Objects.isNull(u)) {
            throw new NegocioException("Email já cadastrado no sistema!");
        }
        usuarioRepository.save(usuarioMapper.toEntity(usuarioDto));
    }

    public UsuarioDto buscar(int id) {
        return usuarioMapper.toDTO(usuarioRepository.findById(id).orElseGet(Usuario::new));
    }

    public void editar(UsuarioDto usuarioDto) {
        usuarioRepository.findById(usuarioDto.getId()).orElseGet(Usuario::new);
    }

    public UsuarioDto logar(LoginRequest requestDTO) throws NegocioException {
        Usuario u = usuarioRepository.findUsuarioByEmail(requestDTO.getEmail());
        if (Objects.isNull(u)) {
            throw new NegocioException("Usuário não encontrado!");
        } else if (!u.getSenha().equals(requestDTO.getSenha())) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED
                    , "Senha incorreta!");
        }
        return usuarioMapper.toDTO(u);
    }

}
