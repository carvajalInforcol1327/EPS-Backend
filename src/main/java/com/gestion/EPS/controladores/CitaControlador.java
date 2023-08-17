package com.gestion.EPS.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.EPS.modelos.Cita;
import com.gestion.EPS.modelos.Paciente;
import com.gestion.EPS.modelos.Usuario;
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
	
	@GetMapping("/cita/paciente/{cedula}")
	public List<Cita>ObtenerCitasPorCedula(@PathVariable Long cedula) throws Exception {
		return CitaService.obtenerCitasPorCedulaPaciente(cedula);
	}
	
	@GetMapping("/cita/especialista/{cedula}")
	public List<Cita>ObtenerCitasPorCedulaEspecialista(@PathVariable Long cedula) throws Exception {
		return CitaService.obtenerCitasPorCedulaEspecialista(cedula);
	}
	
	@GetMapping("/cita")
	public List<Cita>ObtenerTodasLasCitas() throws Exception{
		return CitaService.obtenerTodasLasCitas();
	}
	
	
}