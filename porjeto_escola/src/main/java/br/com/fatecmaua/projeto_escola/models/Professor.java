package br.com.fatecmaua.projeto_escola.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_turma")
	private Turma turma;
	private String nome;
	private String RG;
	private String email;
	private String senha;

	public Professor(Long id, Turma turma, String nome, String RG, String email, String senha) {
		this.id = id;
		this.turma = turma;
		this.nome = nome;
		this.RG = RG;
		this.email = email;
		this.senha = senha;
	}


public Professor() {

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


public String getRG() {
	return RG;
}


public void setRG(String rG) {
	RG = rG;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getSenha() {
	return senha;
}


public void setSenha(String senha) {
	this.senha = senha;
}








}