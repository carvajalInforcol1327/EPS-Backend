package com.gestion.EPS.servicios.impl;

import java.util.List;

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

	@Override
	public List<Cita> obtenerCitasPorCedulaPaciente(Long cedulaPaciente) throws Exception {
		return CitaRepositorio.findByPacienteCedula(cedulaPaciente);
	}

	@Override
	public List<Cita> obtenerTodasLasCitas() throws Exception {
		return CitaRepositorio.findAll();
	}

	@Override
	public List<Cita> obtenerCitasPorCedulaEspecialista(Long cedulaEspecialista) throws Exception {
		return CitaRepositorio.findByEspecialistaCedula(cedulaEspecialista);
	}


	
}