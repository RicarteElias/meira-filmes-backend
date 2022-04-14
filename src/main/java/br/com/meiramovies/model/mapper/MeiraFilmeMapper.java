package br.com.meiramovies.model.mapper;

import br.com.meiramovies.model.dto.MeiraFilmeDto;
import br.com.meiramovies.model.entity.MeiraFilme;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface MeiraFilmeMapper {

    MeiraFilme meiraFilmeDtoToMeiraFilme(MeiraFilmeDto meiraFilmeDto);

    MeiraFilmeDto meiraFilmeToMeiraFilmeDto(MeiraFilme meiraFilme);
}
