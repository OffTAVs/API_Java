package br.com.fatecmaua.projeto_escola.models;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "turma")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "escola")
	@Size(min = 2, max = 80, message = "O nome da escola "
			+ "está em desacordo com as regras")
	@NotEmpty(message = "O nome da escola "
			+ "não pode ser nulo")
	private String escola;
	@NotEmpty(message = "A escola deve ter um um ano")
	
	private Integer ano;
	private Integer serie;

	public Turma() {

	}

	public Turma(Long id, String escola , Integer ano, Integer serie) {
		super();
		this.id = id;
		this.escola = escola;
		this.ano = ano;
		this.serie = serie;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}


	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getserie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	
	
}
