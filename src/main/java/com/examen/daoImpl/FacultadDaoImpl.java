package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.FacultadDao;
import com.examen.entity.Facultad;
import com.examen.repository.FacultadRepository;

@Component
public class FacultadDaoImpl implements FacultadDao{

	@Autowired 
	private FacultadRepository facultadRepository;
	@Override
	public Facultad create(Facultad f) {
		// TODO Auto-generated method stub
		return facultadRepository.save(f);
	}

	@Override
	public Facultad update(Facultad f) {
		// TODO Auto-generated method stub
		return facultadRepository.save(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facultadRepository.deleteById(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return facultadRepository.findById(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return facultadRepository.findAll();
	}

}
