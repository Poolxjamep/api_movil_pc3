package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

	@Query("select x from Editorial x where x.nombre = :var_filtro")
	public List<Autor> listaPorNombre(@Param("var_filtro") String filtro);

}
