package com.apo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apo.model.MarketPlace;

@Repository
public interface MarketPlaceRepository extends JpaRepository<MarketPlace, Long>{

	public List<MarketPlace> findAllByNomeContainingIgnoreCase(@Param("MarketPlace") String nome);
	public List<MarketPlace> findAllByCategoriaProdutoContainingIgnoreCase(@Param("MarketPlace") String categoriaProduto);
	
}
