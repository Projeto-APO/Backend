package com.apo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apo.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("Postagem") String titulo);
	public List<Postagem> findAllByTextoContainingIgnoreCase(@Param("Postagem") String texto);
	public List<Postagem> findAllByTemaContainingIgnoreCase(@Param("Postagem") String tema);
	
}
