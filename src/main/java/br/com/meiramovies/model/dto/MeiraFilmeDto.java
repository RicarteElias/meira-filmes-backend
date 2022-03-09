package br.com.meiramovies.model.dto;

import lombok.Data;

@Data
public class MeiraFilmeDto {

    private Integer id;

    private Integer idPessoa;

    private String releaseDate;

    private String title;

    private String backdropPath;

    private String runtime;
}
