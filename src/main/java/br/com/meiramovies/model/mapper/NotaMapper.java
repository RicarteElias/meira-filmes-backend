package br.com.meiramovies.model.mapper;

import br.com.meiramovies.model.dto.NotaDto;
import br.com.meiramovies.model.entity.Nota;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotaMapper {

    Nota toEntity(NotaDto dto);

    NotaDto toDTO(Nota usuario);
}
