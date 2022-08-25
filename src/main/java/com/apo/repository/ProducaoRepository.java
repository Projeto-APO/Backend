package com.apo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.apo.model.Producao;

public interface ProducaoRepository extends JpaRepository<Producao, Long>{
	
	public List<Producao> findAllByNomeContainigIgnoreCase(@Param("Producao") String nome);
	public List<Producao> findAllByCategoriaProdutoContainigIgnoreCase(@Param("Producao") String categoriaProduto);
	public List<Producao> findByDataPlantio(Date dataPlantio);

}
