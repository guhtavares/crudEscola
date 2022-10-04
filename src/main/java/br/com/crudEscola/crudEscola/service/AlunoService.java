package br.com.crudEscola.crudEscola.service;

import br.com.crudEscola.crudEscola.model.AlunoModel;
import br.com.crudEscola.crudEscola.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AlunoService {

    private AlunoRepository alunoRepository;


    @Transactional
    public AlunoModel save(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

}
