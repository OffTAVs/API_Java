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
import io.swagger.v3.oas.annotations.Operation;


@RestController
public class ProfessorController {
	@Autowired
	private TurmaRepository repTurma;
	@Autowired
	private ProfessorRepository repProfessor;
	@Autowired
	private AlunoRepository repAluno;
	
	@Operation(summary = "Buscar todos os professores", 
			description = "Este endpoint realiza a busca de todos "
					+ "os professores no banco de dados", 
					tags = "Retorno de Informações")
	@GetMapping("/professor/todos")
	public List<Professor> buscarTodosProfessores() {
		return repProfessor.findAll();
}
	
	@Operation(summary = "Buscar os professores por email", 
			description = "Este endpoint realiza a busca de todosos professores no banco de dados "
					+ "com o final de email @escola.edu ", 
					tags = "Retorno de Informações")
	@GetMapping("/professor/todos/email")
	public List<Professor> buscarTodosEmail() {

		List<Professor> professores = repProfessor.findAll();
		List<Professor> resultado = new ArrayList<Professor>();

		for (Professor professor : professores) {
			if (professor.getEmail().contains("@escola.edu")) {
				resultado.add(professor);
			}
		}

		return resultado;

	}

	@Operation(summary = "Remover professores por ID",
			description = "Este endpoint realiza "
					+ "a remoção de "
					+ "professores presentes na base de dados por ID",
					tags = "Remoção de Informações")
	@DeleteMapping("/professor/{id}")
	public void removerProfessorPorID(@PathVariable Long id) {
		Optional<Professor> op = repProfessor.findById(id);
		if(op.isPresent())
			repProfessor.deleteById(id);
	}
	
	@Operation(summary = "Remover professores por nome",
	        description = "Este endpoint realiza a remoção de professores presentes na base de dados por nome",
	        tags = "Remoção de Informações")
	@DeleteMapping("/professor/nome/{nome}")
	public void removerProfessorPorNome(@PathVariable String nome) {
	    List<Professor> professores = repProfessor.findByNome(nome);
	    if (!professores.isEmpty()) {
	        repProfessor.deleteAll(professores);
	    }
	}
	

	@Operation(summary = "Inserir um novo professor",
			description = "Este endpoint realiza "
					+ "a inserção de "
					+ "professores na base de dados",
					tags = "Inserção de Informações")
	@PostMapping("/professor/inserir")
	public void inserirProfessor(@RequestBody Professor professor) {
		repProfessor.save(professor);
	}
	
	@Operation(summary = "Atualizar um professor",
			description = "Este endpoint realiza "
					+ "a atualização de um "
					+ "professor presente na base de dados",
					tags = "Atualização de Informações")
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
