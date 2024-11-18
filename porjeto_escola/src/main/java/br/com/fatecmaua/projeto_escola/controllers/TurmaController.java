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

import br.com.fatecmaua.projeto_escola.models.Turma;
import br.com.fatecmaua.projeto_escola.repositories.AlunoRepository;
import br.com.fatecmaua.projeto_escola.repositories.ProfessorRepository;
import br.com.fatecmaua.projeto_escola.repositories.TurmaRepository;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class TurmaController {

	@Autowired
	private TurmaRepository repTurma;
	@Autowired
	private ProfessorRepository repProfessor;
	@Autowired
	private AlunoRepository repAluno;

	@Operation(summary = "Buscar todas as turmas", 
			description = "Este endpoint realiza a busca de todas "
					+ "as turmas no banco de dados", 
					tags = "Retorno de Informações")
	@GetMapping("/turma/todas")
	public List<Turma> buscarTodasTurmas() {
		return repTurma.findAll();
	}

	@Operation(summary = "Buscar todas as turmas com "
			+ "um determinado número de caracteres",
			description = "Este endpoint realiza "
					+ "a busca de todas as "
					+ "turmas presentes na base de dados"
					+ " com um determinado número de caracteres",
					tags = "Retorno de Informações")
	@GetMapping("/turma/min_caracteres/{var}")
	public List<Turma> retornaTurmaMinCaracteres(@PathVariable int var) {
		List<Turma> todas = repTurma.findAll();
		List<Turma> resultado = new ArrayList<Turma>();

		for (Turma turma : todas) {
			if (turma.getEscola().length() >= var) {
				resultado.add(turma);
			}
		}
		return resultado;
	}

	@Operation(summary = "Buscar todas as turmas que estão no oitavo ano ",
			description = "Este endpoint realiza "
					+ "a busca de todas as "
					+ "turmas que estão no oitavo ano",
					tags = "Retorno de Informações")
	@GetMapping("/turma/todas/8ano")
	public List<Turma> buscarTodas8ano() {

		List<Turma> todas = repTurma.findAll();
		List<Turma> todas_8 = new ArrayList<Turma>();

		for (Turma turma : todas) {
			if (turma.getAno().equals(2024)) {
				todas_8.add(turma);
			}
		}

		return todas_8;

	}
	@Operation(summary = "Buscar as turmas por id ",
			description = "Este endpoint realiza "
					+ "a busca de "
					+ "turmas por id",
					tags = "Retorno de Informações")
	@GetMapping("/turma/{id}")
	public Turma buscarTurmaPorID(@PathVariable Long id) {
		return repTurma.findById(id).get();
	}

	@Operation(summary = "Buscar as turmas por série",
			description = "Este endpoint realiza "
					+ "a busca de "
					+ "turmas por série",
					tags = "Retorno de Informações")
	@GetMapping("/turma/serie/{var}")
	public List<Turma> buscarTurmaMinSerie(@PathVariable Integer var) {

		List<Turma> todas = repTurma.findAll();
		List<Turma> resultado = new ArrayList<Turma>();

		for (Turma turma : todas) {
			if (turma.getserie() >= var) {
				resultado.add(turma);
			}
		}

		return resultado;

	}
	@Operation(summary = "Remover turmas por ID",
			description = "Este endpoint realiza "
					+ "a remoção de "
					+ "turmas presentes na base de dados por ID",
					tags = "Remoção de Informações")
	@DeleteMapping("/turma/{id}")
	public void removerTurmaPorID(@PathVariable Long id) {
		Optional<Turma> op = repTurma.findById(id);
		if (op.isPresent())
			repTurma.deleteById(id);
	}
	@Operation(summary = "Inserir uma nova turma",
			description = "Este endpoint realiza "
					+ "a inserção de "
					+ "turmas na base de dados",
					tags = "Inserção de Informações")
	@PostMapping("/turma/inserir")
	public void inserirTurma(@RequestBody Turma turma) {
		repTurma.save(turma);
	}
	@Operation(summary = "Atualizar uma turma",
			description = "Este endpoint realiza "
					+ "a atualização de uma "
					+ "turma presente na base de dados",
					tags = "Atualização de Informações")
	@PutMapping("/turma/atualizar/{id}")
	public void atualizarTurma(@PathVariable Long id, @RequestBody Turma turma) {

		Optional<Turma> op = repTurma.findById(id);

		if (op.isPresent()) {
			Turma turma_atualizar = op.get();
			turma_atualizar.setEscola(turma.getEscola());
			turma_atualizar.setAno(turma.getAno());
			turma_atualizar.setSerie(turma.getserie());

			repTurma.save(turma_atualizar);
		}

	}
}
