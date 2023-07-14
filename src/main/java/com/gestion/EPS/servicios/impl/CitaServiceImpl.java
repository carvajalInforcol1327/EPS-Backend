package com.gestion.EPS.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.EPS.modelos.Cita;

import com.gestion.EPS.repositorios.*;
import com.gestion.EPS.servicios.CitaService;

@Service
public class CitaServiceImpl implements CitaService{

	@Autowired
	private CitaRepositorio CitaRepositorio;

	@Override
	public Cita guardarCita(Cita cita) throws Exception {
		Cita citaGuardado = CitaRepositorio.save(cita);
		return citaGuardado;
	}


	
}
