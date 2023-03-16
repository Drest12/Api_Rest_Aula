package com.idat.springbootapirestaula.app.models.services;

import java.util.List;

import com.idat.springbootapirestaula.app.models.entity.Aula;

public interface IAulaService {
	
	public List<Aula> findAll();
	public Aula findById(Long id);
	public Aula save (Aula aula);
	public void delete (Long id);

}
