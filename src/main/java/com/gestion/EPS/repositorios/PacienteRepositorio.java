package com.gestion.EPS.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.EPS.modelos.Paciente;

@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente, Long> {

	
}