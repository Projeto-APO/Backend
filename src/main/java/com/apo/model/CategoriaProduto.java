package com.apo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoriaProduto")
public class CategoriaProduto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String titulo;
	
	@NotBlank
	private String descricao;
	
	@OneToMany(mappedBy = "categoriaProduto", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("categoriaProduto")
	private List <MarketPlace> marketPlace;
	
	@OneToMany(mappedBy = "categoriaProduto", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("categoriaProduto")
	private List <Producao> producao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<MarketPlace> getMarketPlace() {
		return marketPlace;
	}

	public void setMarketPlace(List<MarketPlace> marketPlace) {
		this.marketPlace = marketPlace;
	}

	public List<Producao> getProducao() {
		return producao;
	}

	public void setProducao(List<Producao> producao) {
		this.producao = producao;
	}
	
}
