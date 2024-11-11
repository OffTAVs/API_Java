package br.com.fatecmaua.projeto_escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecmaua.projeto_escola.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
