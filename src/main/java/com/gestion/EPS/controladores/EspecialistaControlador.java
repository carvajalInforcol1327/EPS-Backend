package com.gestion.EPS.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestion.EPS.modelos.*;
import com.gestion.EPS.servicios.*;

@RestController
@RequestMapping("/eps/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EspecialistaControlador {
	
	@Autowired
	private EspecialistaService EspecialistaService;
	
	
	@PostMapping("/especialista")
	public Especialista guardarEspecialista(@RequestBody Especialista especialista) throws Exception{
		return EspecialistaService.guardarEspecialista(especialista);
	}
	
	
	
}


