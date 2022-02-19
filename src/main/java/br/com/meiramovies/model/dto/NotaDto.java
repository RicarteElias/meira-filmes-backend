package br.com.meiramovies.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class NotaDto implements Serializable {
    private final Integer id;
    private final UsuarioDto usuario;
    private final Long idFilme;
    private final String comentario;
    private final Integer nota;
}
