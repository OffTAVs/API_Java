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

import br.com.fatecmaua.projeto_escola.models.Aluno;
import br.com.fatecmaua.projeto_escola.models.Professor;
import br.com.fatecmaua.projeto_escola.models.Turma;
import br.com.fatecmaua.projeto_escola.repositories.AlunoRepository;
import br.com.fatecmaua.projeto_escola.repositories.ProfessorRepository;
import br.com.fatecmaua.projeto_escola.repositories.TurmaRepository;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class AlunoController {
	@Autowired
	private TurmaRepository repTurma;
	@Autowired
	private ProfessorRepository repProfessor;
	@Autowired
	private AlunoRepository repAluno;


	@Operation(summary = "Buscar todos os alunos", 
			description = "Este endpoint realiza a busca de todos "
					+ "os alunos no banco de dados", 
					tags = "Retorno de Informações")
	@GetMapping("/aluno/todas")
	public List<Aluno> buscarTodosAlunos() {
		return repAluno.findAll();
}
	
	@Operation(summary = "Remover alunos por ID",
			description = "Este endpoint realiza "
					+ "a remoção de "
					+ "alunos presentes na base de dados por ID",
					tags = "Remoção de Informações")
	@DeleteMapping("/aluno/{id}")
	public void removerAlunoPorID(@PathVariable Long id) {
		Optional<Aluno> op = repAluno.findById(id);
		if(op.isPresent())
			repAluno.deleteById(id);
	}
	
	@Operation(summary = "Inserir um novo aluno",
			description = "Este endpoint realiza "
					+ "a inserção de "
					+ "alunos na base de dados",
					tags = "Inserção de Informações")
	@PostMapping("/aluno/inserir")
	public void inserirAluno(@RequestBody Aluno aluno) {
		repAluno.save(aluno);
	}
	
	@Operation(summary = "Atualizar um aluno",
			description = "Este endpoint realiza "
					+ "a atualização de um "
					+ "aluno presente na base de dados",
					tags = "Atualização de Informações")
	@PutMapping("/aluno/atualizar/{id}")
	public void 
	atualizarAluno(@PathVariable Long id, 
			@RequestBody Aluno aluno) {
		
		Optional<Aluno> op = repAluno.findById(id);
		
		if(op.isPresent()) {
			Aluno aluno_atualizar = op.get(); 
			aluno_atualizar.setNome(aluno.getNome());
			aluno_atualizar.setFaltas(aluno.getFaltas());
			aluno_atualizar.setTelefone_contato(aluno.getTelefone_contato());
		
			repAluno.save(aluno_atualizar);
		}
	}
}
