package com.gestion.EPS.servicios;

import java.util.List;

import com.gestion.EPS.modelos.Especialista;

public interface EspecialistaService {

	public Especialista guardarEspecialista(Especialista especialista) throws Exception;
	
	public List<Especialista>listarTodosLosEspecialistas() throws Exception;
}
