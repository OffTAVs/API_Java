package br.com.fatecmaua.projeto_escola.controllers;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecmaua.projeto_escola.models.Professor;
import br.com.fatecmaua.projeto_escola.models.Turma;
import br.com.fatecmaua.projeto_escola.repositories.AlunoRepository;
import br.com.fatecmaua.projeto_escola.repositories.ProfessorRepository;
import br.com.fatecmaua.projeto_escola.repositories.TurmaRepository;


@RestController
public class ProfessorController {
	@Autowired
	private TurmaRepository repTurma;
	@Autowired
	private ProfessorRepository repProfessor;
	@Autowired
	private AlunoRepository repAluno;

	@GetMapping("/professor/todos")
	public List<Professor> buscarTodosProfessores() {
		return repProfessor.findAll();
}
	
	
	@DeleteMapping("/professor/{id}")
	public void removerProfessorPorID(@PathVariable Long id) {
		Optional<Professor> op = repProfessor.findById(id);
		if(op.isPresent())
			repProfessor.deleteById(id);
	}
	
	@PostMapping("/professor/inserir")
	public void inserirProfessor(@RequestBody Professor professor) {
		repProfessor.save(professor);
	}
	
	@PutMapping("/professor/atualizar/{id}")
	public void 
	atualizarProfessor(@PathVariable Long id, 
			@RequestBody Professor professor) {
		
		Optional<Professor> op = repProfessor.findById(id);
		
		if(op.isPresent()) {
			Professor professor_atualizar = op.get(); 
			professor_atualizar.setNome(professor.getNome());
			professor_atualizar.setRG(professor.getRG());
			professor_atualizar.setEmail(professor.getEmail());
			professor_atualizar.setSenha(professor.getSenha());

			
			repProfessor.save(professor_atualizar);
		}
	}
	
}
