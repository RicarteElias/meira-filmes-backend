package br.com.meiramovies.model.mapper;

import br.com.meiramovies.model.dto.UsuarioDto;
import br.com.meiramovies.model.entity.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDto dto);

    UsuarioDto toDTO(Usuario usuario);

}
