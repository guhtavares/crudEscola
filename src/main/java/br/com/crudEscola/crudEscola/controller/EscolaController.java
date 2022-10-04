package br.com.crudEscola.crudEscola.controller;


import br.com.crudEscola.crudEscola.dto.request.AlunoRequest;
import br.com.crudEscola.crudEscola.model.AlunoModel;
import br.com.crudEscola.crudEscola.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Escola")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EscolaController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Object> cadastrarAluno(@RequestBody @Valid AlunoRequest alunoRequest){
        var alunoModel = new AlunoModel();
        BeanUtils.copyProperties(alunoRequest, alunoModel);
        alunoModel.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(alunoModel));
    }


}
