package com.gestion.EPS.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.EPS.modelos.Paciente;
import com.gestion.EPS.servicios.PacienteService;
import com.gestion.EPS.repositorios.*;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepositorio PacienteRepositorio;
	
	@Override
	public Paciente guardarPaciente(Paciente paciente) throws Exception {
		Paciente pacienteGuardado = PacienteRepositorio.save(paciente);
		return pacienteGuardado;	
	}
	
	

}
