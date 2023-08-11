package com.gestion.EPS.controladores;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gestion.EPS.modelos.*;
import com.gestion.EPS.servicios.*;



@RestController
@RequestMapping("/eps/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EspecialidadControlador {
	
	
	@Autowired
	private EspecialidadService especialidadService;
	

	@GetMapping("/especialidad")
	public ResponseEntity<List<Especialidad>> listarEspecialidad(){
		return new ResponseEntity<>(especialidadService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/especialidad")
	public ResponseEntity<Especialidad>crearEspecialidad(@RequestBody Especialidad especialidad){
		return new ResponseEntity<>(especialidadService.save(especialidad),HttpStatus.CREATED);
	}
	
			
		
}
