package br.com.crudEscola.crudEscola.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class AlunoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    @Size(max = 14)
    private String cpf;

    @NotBlank
    private String dataNascimento;
}
