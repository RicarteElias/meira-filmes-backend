package br.com.meiramovies.service;

import br.com.meiramovies.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeiraFilmeService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public MeiraFilmeService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    

}
