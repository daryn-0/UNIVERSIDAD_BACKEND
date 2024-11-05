package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.dao.FacultadDao;
import com.examen.entity.Facultad;
import com.examen.service.FacultadService;

@Service
public class FacultadServiceImpl implements FacultadService{

	@Autowired
	private FacultadDao dao;
	@Override
	public Facultad create(Facultad f) {
		// TODO Auto-generated method stub
		return dao.create(f);
	}

	@Override
	public Facultad update(Facultad f) {
		// TODO Auto-generated method stub
		return dao.update(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
