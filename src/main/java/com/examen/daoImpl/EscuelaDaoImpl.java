package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.EscuelaDao;
import com.examen.entity.Escuela;
import com.examen.repository.EscuelaRepository;

@Component
public class EscuelaDaoImpl implements EscuelaDao{

	@Autowired
	private EscuelaRepository escuelaRepository;
	@Override
	public Escuela create(Escuela e) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(e);
	}

	@Override
	public Escuela update(Escuela e) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		escuelaRepository.deleteById(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return escuelaRepository.findById(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return escuelaRepository.findAll();
	}

}
