package com.gestion.EPS.servicios.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gestion.EPS.excepciones.ResourceNotFoundException;
import com.gestion.EPS.modelos.Especialista;
import com.gestion.EPS.servicios.*;
import com.gestion.EPS.repositorios.EspecialistaRepositorio;

@Service
public class EspecialistaServiceImpl implements EspecialistaService{

	@Autowired
	private EspecialistaRepositorio especialistaRepositorio;
	
		@Override
		public Especialista findById(Long cedula) {
			return especialistaRepositorio.findById(cedula).orElse(null);
		}


		@Override
		public List<Especialista> findAll() {
			return especialistaRepositorio.findAll();
		}


		@Override
		public void delete(Long cedula) {
			especialistaRepositorio.deleteById(cedula);		
		}


		@Override
		public Especialista save(Especialista especialista) {
				return especialistaRepositorio.save(especialista);
		}


		@Override
		public ResponseEntity<Especialista> actualizarEspecialista(Long cedula, Especialista detallesEspecialista) {
				Especialista especialista = especialistaRepositorio.findById(cedula).orElseThrow(() -> new ResourceNotFoundException("No existe empleado :" + cedula));
				
				especialista.setCedula(detallesEspecialista.getCedula());
				especialista.setNombres(detallesEspecialista.getNombres());
				especialista.setEnabled(detallesEspecialista.isEnabled());
				especialista.setEspecialidad(detallesEspecialista.getEspecialidad());
				
				Especialista especialistaActualizado = especialistaRepositorio.save(especialista);
					return ResponseEntity.ok(especialista);
		}



	
}
