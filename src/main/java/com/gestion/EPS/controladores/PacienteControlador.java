package com.gestion.EPS.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.EPS.modelos.Paciente;
import com.gestion.EPS.servicios.*;

@RestController
@RequestMapping("/eps/")
@CrossOrigin(origins = "http://localhost:4200/")
public class PacienteControlador {

	@Autowired
	private PacienteService PacienteService;

	@PostMapping("/paciente")
	public Paciente guardarPaciente(@RequestBody Paciente paciente) throws Exception {
		return PacienteService.guardarPaciente(paciente);
	}

	@GetMapping("/paciente")
	public List<Paciente> listarTodosLosPacientes() throws Exception {
		return PacienteService.listarTodosLosPacientes();
	}

	@GetMapping("/paciente/{cedula}")
	public ResponseEntity<Paciente> obtenerPacientePorId(@PathVariable Long cedula) throws Exception {
		return PacienteService.obtenerPacientePorId(cedula);
	}

	@PutMapping("/paciente/{cedula}")
	public ResponseEntity<Paciente> actualizarPaciente(@PathVariable Long cedula,
			@RequestBody Paciente detallesPaciente) throws Exception {
		return PacienteService.actualizarPaciente(cedula, detallesPaciente);
	}
	
	@PutMapping("/paciente/eliminar/{cedula}")
	public ResponseEntity<Paciente> actualizarPacienteEliminar(@PathVariable Long cedula,
			@RequestBody Paciente detallesPacienteEliminar) throws Exception {
		detallesPacienteEliminar.setEnabled(false);
		return PacienteService.actualizarPaciente(cedula, detallesPacienteEliminar);
	}

}
