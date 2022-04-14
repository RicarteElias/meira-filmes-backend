package br.com.meiramovies.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_usuario", schema = "meira")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
    @SequenceGenerator(schema = "meira", sequenceName = "sq_usuario", initialValue = 1, allocationSize = 1, name = "sq_usuario")
    private Integer id;

    @Column(length = 50)
    private String nome;

    @Column(length = 50)
    private String senha;

    @Column(length = 100)
    private String email;

    public Usuario(String nome) {
        this.nome = nome;
    }

}
