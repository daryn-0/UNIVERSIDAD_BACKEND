package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.dao.EscuelaDao;
import com.examen.entity.Escuela;
import com.examen.service.EscuelaService;

@Service
public class EscuelaServiceImpl implements EscuelaService{

	@Autowired
	private EscuelaDao dao;
	
	@Override
	public Escuela create(Escuela e) {
		// TODO Auto-generated method stub
		return dao.create(e);
	}

	@Override
	public Escuela update(Escuela e) {
		// TODO Auto-generated method stub
		return dao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
