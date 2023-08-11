package com.gestion.EPS.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gestion.EPS.modelos.*;
import com.gestion.EPS.servicios.*;


@RestController
@RequestMapping("/eps/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EspecialistaControlador {
	
	
	@Autowired
	private EspecialistaService especialistaService;
	
	@Autowired
	private EspecialidadService especialidadService;
	
	@GetMapping("/especialista")
	public ResponseEntity<List<Especialista>> listarEspecialista(){
		return new ResponseEntity<>(especialistaService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/especialista/{cedula}")
	public ResponseEntity<Especialista> EspecialistaxId(@PathVariable Long cedula) throws Exception{
		return new ResponseEntity<>(especialistaService.findById(cedula),HttpStatus.OK);
	}
	
	@GetMapping("/especialidades")
	public ResponseEntity<List<Especialidad>> listarEspecialidades(){
		return new ResponseEntity<>(especialidadService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/especialista")
	public ResponseEntity<Especialista>crearEspecialista(@RequestBody Especialista especialista){
		return new ResponseEntity<>(especialistaService.save(especialista), HttpStatus.CREATED);
	} 

	
	@PutMapping("/especialista/{cedula}")
	public ResponseEntity<Especialista> actualizarEspecialista(@PathVariable Long cedula, @RequestBody Especialista especialista){
		Especialista especialistaEncontrado = especialistaService.findById(cedula);
		
		if(especialistaEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		try {
			especialistaEncontrado.setNombres(especialista.getNombres());
			especialistaEncontrado.setEspecialidad(especialista.getEspecialidad());
			//especialistaEncontrado.setEnabled(especialista.getEnable());
			especialistaEncontrado.setCedula(especialista.getCedula());
			return new ResponseEntity<>(especialistaService.save(especialistaEncontrado),HttpStatus.CREATED);
		}catch(DataAccessException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
}












