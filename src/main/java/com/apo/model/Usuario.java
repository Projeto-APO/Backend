package com.apo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank
	@Size(min = 5, max = 20, message = "O login deve conter no mínimo de 5 e máximo de 20 caracteres.")
	private String login;
	
	@NotBlank
	@Size(min = 8, message = "A senha deve conter no mínimo 8 caracteres.")
	private String senha;
	
	@NotBlank
	private String tipoUsuario;
	
	@NotBlank
	private String genero;
	
	@NotBlank
	private String telefone;
	
	@Email
	private String email;
	
	private String foto;
	
	private String endereco;
	
	private String cidade;
	
	private String estado;
	
	private String nome_propiedade;
	
	private String codigoFiliado;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("usuario")
	private List <Postagem> postagem;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("usuario")
	private List <Evento> evento;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("usuario")
	private List <MarketPlace> marketPlace;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("usuario")
	private List <Producao> producao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome_propiedade() {
		return nome_propiedade;
	}

	public void setNome_propiedade(String nome_propiedade) {
		this.nome_propiedade = nome_propiedade;
	}

	public String getCodigoFiliado() {
		return codigoFiliado;
	}

	public void setCodigoFiliado(String codigoFiliado) {
		this.codigoFiliado = codigoFiliado;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public List<Evento> getEvento() {
		return evento;
	}

	public void setEvento(List<Evento> evento) {
		this.evento = evento;
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
