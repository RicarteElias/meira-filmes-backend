package br.com.meiramovies.model.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalvarNotaDto implements Serializable {
    private  Integer id;
    private  Integer usuario;
    private  Long idFilme;
    private  String comentario;
    private  Integer nota;
}
