package com.gestion.EPS.servicios;


import java.util.*;

import com.gestion.EPS.modelos.Especialidad;


public interface EspecialidadService{
	
	Especialidad save(Especialidad especialidad);
	
	Especialidad findById(Long especialidad_id);
	
	List<Especialidad> findAll();
	
	public void delete(Long especialidad_id);
	
}






