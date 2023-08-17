package com.gestion.EPS.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestion.EPS.modelos.Paciente;
import com.gestion.EPS.servicios.PacienteService;
import com.gestion.EPS.excepciones.ResourceNotFoundException;
import com.gestion.EPS.repositorios.*;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepositorio PacienteRepositorio;
	
	@Override
	public Paciente guardarPaciente(Paciente paciente) throws Exception {
		Paciente pacienteGuardado = PacienteRepositorio.save(paciente);
		return pacienteGuardado;	
	}

	@Override
	public List<Paciente> listarTodosLosPacientes() throws Exception {
		return PacienteRepositorio.findAll();
	}

	@Override
	public ResponseEntity<Paciente> obtenerPacientePorId(Long cedula) throws Exception {
		Paciente paciente = PacienteRepositorio.findById(cedula).orElseThrow(()-> new ResourceNotFoundException("No existe paciente :" + cedula));
		return ResponseEntity.ok(paciente);
	}

	@Override
	public ResponseEntity<Paciente> actualizarPaciente(Long cedula, Paciente detallesPaciente) throws Exception {
		Paciente paciente = PacienteRepositorio.findById(cedula).orElseThrow(() -> new ResourceNotFoundException("No existe empleado :" + cedula));
		paciente.setCedula(detallesPaciente.getCedula());
		paciente.setNombres(detallesPaciente.getNombres());
		paciente.setApellidos(detallesPaciente.getApellidos());
		paciente.setCorreo(detallesPaciente.getCorreo());
		paciente.setRh(detallesPaciente.getRh());
		paciente.setDepartamento(detallesPaciente.getDepartamento());
		paciente.setCiudad(detallesPaciente.getCiudad());
		paciente.setDireccion(detallesPaciente.getDireccion());
		paciente.setEnabled(detallesPaciente.isEnabled());
		
		Paciente pacienteActualizado = PacienteRepositorio.save(paciente);
		return ResponseEntity.ok(paciente);
	}
	
	
	
	
}