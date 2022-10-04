package br.com.crudEscola.crudEscola.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
@Entity
@Table(name = "TB_ALUNO")
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 200)
    private String nome;

    @Column(nullable = false, unique = true)
    private LocalDateTime dataNascimento;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
}
