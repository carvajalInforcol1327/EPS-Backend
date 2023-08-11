package com.gestion.EPS.servicios;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestion.EPS.modelos.Especialista;

public interface EspecialistaService {

	public Especialista save(Especialista especialista);
	
	public Especialista findById(Long cedula);
	
	public List<Especialista> findAll();
	
	public void delete(Long cedula);
	
	public ResponseEntity<Especialista> actualizarEspecialista(@PathVariable Long cedula, @RequestBody Especialista detallesEspecialista);
}
