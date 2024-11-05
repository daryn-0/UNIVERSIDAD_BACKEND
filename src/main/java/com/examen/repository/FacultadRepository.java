package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.entity.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long>{

}
