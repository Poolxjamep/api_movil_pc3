package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Editorial;

public interface EditorialService {

	public List<Editorial> listaEditorial();
	public List<Editorial> listaEditorialPorNombre(String nombre);
}
