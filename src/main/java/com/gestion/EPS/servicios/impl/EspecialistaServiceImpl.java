package com.gestion.EPS.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion.EPS.modelos.Especialista;
import com.gestion.EPS.servicios.*;
import com.gestion.EPS.repositorios.EspecialistaRepositorio;

@Service
public class EspecialistaServiceImpl implements EspecialistaService {

	@Autowired
	private EspecialistaRepositorio EspecialistaRepositorio;

	@Override
	public Especialista guardarEspecialista(Especialista especialista) throws Exception {
		Especialista especialistaGuardado = EspecialistaRepositorio.save(especialista);
		return especialistaGuardado;
	}

	@Override
	public List<Especialista> listarTodosLosEspecialistas() throws Exception {
		return EspecialistaRepositorio.findAll();
	}


	

	
}
