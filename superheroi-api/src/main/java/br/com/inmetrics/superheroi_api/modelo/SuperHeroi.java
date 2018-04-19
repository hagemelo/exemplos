package br.com.inmetrics.superheroi_api.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class SuperHeroi {
	
	@Id
	@Column(name = "ID", nullable = false)
	@SequenceGenerator(name = "id", sequenceName = "GEN_SUPER_ID", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
	private Long id;
	
	private String nome;
	private String corPredominante;
	private String superPoder;
	
	@JsonFormat(pattern="dd/MM/YYYY")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cadastro = new Date();
	
	SuperHeroi(){}
	
	public SuperHeroi(String nome, String corPredominante, String superPoder) {
		
		this.nome = nome;
		this.corPredominante = corPredominante;
		this.superPoder = superPoder;
		this.cadastro = new Date();
	}

	public Date getCadastro() {
		return cadastro;
	}

	public String getNome() {
		return nome;
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public String getSuperPoder() {
		return superPoder;
	}

	public Long getId() {
		return id;
	}
	
}
