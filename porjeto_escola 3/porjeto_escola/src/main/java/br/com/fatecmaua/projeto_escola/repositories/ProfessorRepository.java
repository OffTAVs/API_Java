package br.com.fatecmaua.projeto_escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fatecmaua.projeto_escola.models.Professor;


public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
