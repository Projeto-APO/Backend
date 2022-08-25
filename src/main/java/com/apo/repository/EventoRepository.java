package com.apo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apo.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

	public List<Evento> findAllByTituloContainingIgnoreCase(@Param("Evento") String titulo);
	public List<Evento> findAllByCategoriaContainingIgnoreCase(@Param("Evento") String categoria);
	public List<Evento> findByData(Date data);
	
	}
