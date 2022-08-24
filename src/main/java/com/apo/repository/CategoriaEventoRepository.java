package com.apo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apo.model.CategoriaEvento;


@Repository
public interface CategoriaEventoRepository extends JpaRepository<CategoriaEvento, Long> {
	
	public List<CategoriaEvento> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}
