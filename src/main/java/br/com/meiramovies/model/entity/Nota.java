package br.com.meiramovies.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_nota", schema = "meira")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne()
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "id_filme")
    private Long idFilme;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    @Column(name = "nota", nullable = false)
    private Integer nota;

}