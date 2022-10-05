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
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/escola")
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

    @GetMapping
    public ResponseEntity<List<AlunoModel>> getAllAluno(){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.findAll());
    }


}
