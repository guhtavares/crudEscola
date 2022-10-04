package br.com.crudEscola.crudEscola.dto.request;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class AlunoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private LocalDateTime dataNascimento;

    @NotBlank
    private String cpf;
}
