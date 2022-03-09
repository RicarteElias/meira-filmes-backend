package br.com.meiramovies.service;

import br.com.meiramovies.model.dto.SalvarNotaDto;
import br.com.meiramovies.model.entity.Nota;
import br.com.meiramovies.repository.NotaRepository;
import br.com.meiramovies.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {
    private final NotaRepository notaRepository;
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public NotaService(NotaRepository notaRepository, UsuarioRepository usuarioRepository) {
        this.notaRepository = notaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public void salvar(SalvarNotaDto notaParam) {
        Nota nota = new Nota();
        nota.setNota(notaParam.getNota());
        nota.setComentario(notaParam.getComentario());
        nota.setUsuario(usuarioRepository.findById(notaParam.getUsuario()).get());
        nota.setIdFilme(notaParam.getIdFilme());
        notaRepository.save(nota);
    }


}
