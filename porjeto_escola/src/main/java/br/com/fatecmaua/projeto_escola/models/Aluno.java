package br.com.fatecmaua.projeto_escola.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "aluno")
public class Aluno {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_turma")
	//@JoinColumn(name = "id_responsavel")
	private Turma turma;
	private String nome;
	private Integer faltas;
	private String telefone_contato;

	public Aluno(Long id,Turma turma, String nome, Integer faltas, String telefone_contato) {
		this.id = id;
		this.turma = turma;
		this.nome = nome;
		this.faltas = faltas;
		this.telefone_contato = telefone_contato;
	
	}


public Aluno() {

}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}



public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public Integer getFaltas() {
	return faltas;
}


public void setFaltas(Integer faltas) {
	this.faltas = faltas;
}


public String getTelefone_contato() {
	return telefone_contato;
}


public void setTelefone_contato(String telefone_contato) {
	this.telefone_contato = telefone_contato;
}



}
