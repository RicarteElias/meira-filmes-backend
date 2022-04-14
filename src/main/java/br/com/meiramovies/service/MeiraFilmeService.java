package br.com.meiramovies.service;

import br.com.meiramovies.exceptions.NegocioException;
import br.com.meiramovies.model.dto.MeiraFilmeDto;
import br.com.meiramovies.model.entity.MeiraFilme;
import br.com.meiramovies.model.mapper.MeiraFilmeMapper;
import br.com.meiramovies.repository.MeiraFilmeRepository;
import br.com.meiramovies.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeiraFilmeService {

    private final UsuarioRepository usuarioRepository;
    private final MeiraFilmeRepository meiraFilmeRepository;
    private final MeiraFilmeMapper meiraFilmeMapper;

    @Autowired
    public MeiraFilmeService(UsuarioRepository usuarioRepository, MeiraFilmeRepository meiraFilmeRepository, MeiraFilmeMapper meiraFilmeMapper) {
        this.usuarioRepository = usuarioRepository;
        this.meiraFilmeRepository = meiraFilmeRepository;
        this.meiraFilmeMapper = meiraFilmeMapper;
    }

    public void salvarFilme(MeiraFilmeDto filmeDto, Integer id) {
        if (meiraFilmeRepository.getIdsFilmeAdicionados(id).size() >= 3) {
            throw new NegocioException("Você já adicionou filmes suficientes a lista!");
        }
        MeiraFilme filme = meiraFilmeMapper.meiraFilmeDtoToMeiraFilme(filmeDto);
        filme.setUsuario(usuarioRepository.findById(id).get());
        meiraFilmeRepository.save(filme);
    }

    public List<MeiraFilmeDto> buscarFilmes() {
        return meiraFilmeRepository.getAllDto();
    }
}
