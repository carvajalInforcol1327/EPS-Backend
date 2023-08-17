package com.gestion.EPS.servicios;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestion.EPS.modelos.Paciente;




public interface PacienteService {
	
	public Paciente guardarPaciente(Paciente paciente) throws Exception;
	

	public List<Paciente> listarTodosLosPacientes() throws Exception;
	
	public ResponseEntity<Paciente>obtenerPacientePorId(@PathVariable Long cedula) throws Exception;
	
	public ResponseEntity<Paciente> actualizarPaciente(@PathVariable Long cedula, @RequestBody Paciente detallesPaciente) throws Exception;
	
	


}