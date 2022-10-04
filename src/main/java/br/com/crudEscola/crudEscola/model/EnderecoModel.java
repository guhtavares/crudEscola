package br.com.crudEscola.crudEscola.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 200)
    private String nome;

    private Long numero;
    private String cep;
    private String cidade;
    private String estado;
}
