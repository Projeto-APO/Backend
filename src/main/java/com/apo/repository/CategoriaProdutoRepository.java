package com.apo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apo.model.CategoriaProduto;

@Repository
public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Long>{

	public List<CategoriaProduto> findAllByTituloContainingIgnoreCase (@Param("CategoriaProduto") String titulo);
	
}
