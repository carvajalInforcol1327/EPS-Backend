package com.gestion.EPS.servicios.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.EPS.modelos.*;
import com.gestion.EPS.repositorios.*;
import com.gestion.EPS.servicios.*;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {
	
	
	@Autowired
	private EspecialidadRepositorio especialidadRepositorio;

	@Override
	public Especialidad save(Especialidad especialidad) {
		return especialidadRepositorio.save(especialidad);
	}

	@Override
	public Especialidad findById(Long especialidad_id) {
		return especialidadRepositorio.findById(especialidad_id).orElse(null);
	}

	@Override
	public List<Especialidad> findAll() {
		return especialidadRepositorio.findAll();
	}

	@Override
	public void delete(Long especialidad_id) {
			especialidadRepositorio.deleteById(especialidad_id);
	}
	


}