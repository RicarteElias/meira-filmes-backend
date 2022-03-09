package br.com.meiramovies.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_filmes_meira", schema = "meira")
public class MeiraFilme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne()
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "release_date", nullable = false, length = 255)
    private String releaseDate;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "backdrop_path", nullable = false, length = 255)
    private String backdropPath;

    @Column(name = "runtime", nullable = false, length = 255)
    private String runtime;

}
