package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entity.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

	@Query("select x from Editorial x where x.nombre = :var_filtro")
	public List<Editorial> listaPorNombre(@Param("var_filtro") String filtro);
}
