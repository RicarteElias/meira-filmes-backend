package br.com.meiramovies.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_FILME_MEIRA", schema = "meira")
public class MeiraFilme {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne()
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "title")
    private String title;

    @Column(name = "backdrop_path")
    private String backdropPath;

    @Column(name = "assistido")
    private boolean assistido;

}
