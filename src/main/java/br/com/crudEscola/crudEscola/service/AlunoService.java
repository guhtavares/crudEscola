package br.com.crudEscola.crudEscola.service;

import br.com.crudEscola.crudEscola.model.AlunoModel;
import br.com.crudEscola.crudEscola.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;


    @Transactional
    public AlunoModel save(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }


    public List<AlunoModel> findAll(){
        return alunoRepository.findAll();
    }
}
