package br.com.meiramovies.model.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private Integer id;
    private String nome;
    private String senha;
    private String email;
}
