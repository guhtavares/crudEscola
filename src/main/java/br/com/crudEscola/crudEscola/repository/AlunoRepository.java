package br.com.crudEscola.crudEscola.repository;

import br.com.crudEscola.crudEscola.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;


public interface AlunoRepository extends JpaRepository<AlunoModel, UUID> {

}
