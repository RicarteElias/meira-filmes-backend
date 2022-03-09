package br.com.meiramovies.model.mapper;

import br.com.meiramovies.model.dto.MeiraFilmeDto;
import br.com.meiramovies.model.entity.MeiraFilme;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

public interface SalvarMeiraFilmeMapper {

    MeiraFilme meiraFilmeDtoToMeiraFilme(MeiraFilmeDto meiraFilmeDto);

    MeiraFilmeDto meiraFilmeToMeiraFilmeDto(MeiraFilme meiraFilme);
}
