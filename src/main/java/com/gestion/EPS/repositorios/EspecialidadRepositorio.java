package com.gestion.EPS.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.EPS.modelos.Especialidad;


@Repository
public interface EspecialidadRepositorio extends JpaRepository<Especialidad, Long>{
	

}
