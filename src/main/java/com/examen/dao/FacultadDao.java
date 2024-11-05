package com.examen.dao;

import java.util.List;
import java.util.Optional;

import com.examen.entity.Facultad;

public interface FacultadDao {
	Facultad create(Facultad f);
	Facultad update(Facultad f);
	void delete(Long id);
	Optional<Facultad> read(Long id);
	List<Facultad> readAll();
}
