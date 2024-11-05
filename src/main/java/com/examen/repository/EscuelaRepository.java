package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.entity.Escuela;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long>{

}
