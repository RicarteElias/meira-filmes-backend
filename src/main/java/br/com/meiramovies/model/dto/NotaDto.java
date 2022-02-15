package br.com.meiramovies.model.dto;

import br.com.meiramovies.model.dto.UsuarioDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class NotaDto implements Serializable {
    private final Integer id;
    private final UsuarioDto usuario;
    private final Long idFilme;
    private final String descricao;
    private final Integer nota;
}
