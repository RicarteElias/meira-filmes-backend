package br.com.meiramovies.repository;

import br.com.meiramovies.model.dto.MeiraFilmeDto;
import br.com.meiramovies.model.entity.MeiraFilme;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeiraFilmeRepository extends CrudRepository<MeiraFilme, Integer> {

    @Query("SELECT new br.com.meiramovies.model.dto.MeiraFilmeDto(m.id, m.usuario.nome,m.releaseDate,m.title,m.backdropPath) FROM MeiraFilme m")
    List<MeiraFilmeDto> getAllDto();


}
