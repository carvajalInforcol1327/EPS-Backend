package com.gestion.EPS.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.EPS.modelos.Cita;
import com.gestion.EPS.servicios.CitaService;





@RestController
@RequestMapping("/eps/")
@CrossOrigin(origins = "http://localhost:4200/")

public class CitaControlador {
	
	@Autowired
	private CitaService CitaService;
	
	
	@PostMapping("/cita")
	public Cita guardarEspecialista(@RequestBody Cita cita) throws Exception{
		return CitaService.guardarCita(cita);
	}
	
	

}
