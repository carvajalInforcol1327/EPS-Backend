package com.gestion.EPS.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.EPS.modelos.Cita;
import com.gestion.EPS.modelos.Paciente;


@Repository
public interface CitaRepositorio extends JpaRepository<Cita, Long> {
	
	List<Cita> findByPacienteCedula(Long cedulaPaciente);
	
	List<Cita> findByEspecialistaCedula(Long cedulaEspecialista);


}
