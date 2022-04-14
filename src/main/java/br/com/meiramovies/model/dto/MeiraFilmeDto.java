package br.com.meiramovies.model.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeiraFilmeDto {

    private Integer id;

    @JsonAlias("release_date")
    private LocalDate releaseDate;

    private String title;

    @JsonAlias("backdrop_path")
    private String backdropPath;

}
