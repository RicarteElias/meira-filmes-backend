package br.com.meiramovies.model.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeiraFilmeDto {

    private Integer id;

    private Integer idPessoa;

    private String usuarioNome;

    @JsonAlias("release_date")
    private LocalDate releaseDate;

    private String title;

    @JsonAlias("backdrop_path")
    private String backdropPath;


}
