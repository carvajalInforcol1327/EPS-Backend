package com.gestion.EPS.servicios;


import java.util.List;

import com.gestion.EPS.modelos.Cita;


public interface CitaService {

	public Cita guardarCita(Cita cita) throws Exception;
	
	 public List<Cita> obtenerCitasPorCedulaPaciente(Long cedulaPaciente) throws Exception;
	 
	 public List<Cita> obtenerCitasPorCedulaEspecialista(Long cedulaEspecialista) throws Exception;
	 
	 public List<Cita> obtenerTodasLasCitas() throws Exception;
	      
}