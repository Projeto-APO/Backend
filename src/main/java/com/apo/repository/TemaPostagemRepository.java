package com.apo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apo.model.TemaPostagem;

@Repository
public interface TemaPostagemRepository extends JpaRepository<TemaPostagem, Long> {

	public List<TemaPostagem> findAllByTituloContainingIgnoreCase(@Param("TemaPostagem") String titulo);

}
