package com.gestion.EPS;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gestion.EPS.modelos.*;
import com.gestion.EPS.servicios.CitaService;
import com.gestion.EPS.servicios.EspecialistaService;
import com.gestion.EPS.servicios.PacienteService;

@SpringBootApplication
public class GestionEpsBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(GestionEpsBackendApplication.class, args);
	}

	/*
	@Autowired
	private PacienteService pacienteservice;
	
	@Autowired
	private EspecialistaService especialistaservice;
	
	@Autowired
	private CitaService citaservice;


	@Override
	public void run(String... args) throws Exception {
		
		Paciente paciente = new Paciente();
		
		paciente.setCedula(1007656389L);
		paciente.setNombres("PACIENTE CITA");
		paciente.setApellidos("PACIENTE CITA");
		paciente.setCorreo("PACIENTE275@gmail.com");
		paciente.setRh("A+");
		paciente.setCiudad("CALI");
		paciente.setTelefono("3137283848");
		paciente.setDepartamento("VALLE");
		paciente.setDireccion("CLL 48 #19-200");
		
		Paciente pacienteguardado = pacienteservice.guardarPaciente(paciente);
		System.out.println(pacienteguardado.getNombres());
		
		
		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		Especialista especialista = new Especialista();
		
		especialista.setCedula(1007656389L);
		especialista.setNombres("ESPECIALISTA CITA");
		especialista.setApellidos("ESPECIALISTA CITA");
		especialista.setCorreo("ESPECIALISTA275@gmail.com");
		especialista.setRh("A+");
		especialista.setCiudad("CALI");
		especialista.setTelefono("3137283848");
		especialista.setDepartamento("VALLE");
		especialista.setDireccion("CLL 48 #19-200");
		especialista.setEspecialidad("ORTOPEDIA");
		
		Especialista especialistaguardado = especialistaservice.guardarEspecialista(especialista);
		System.out.println(especialistaguardado.getNombres());
		
		
		Cita cita = new Cita();
		
		
		LocalDate localDate = LocalDate.of(2023, 8, 19);
		Date date = (Date) Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		
		 
		java.util.Date fechaActual = new java.util.Date();
		java.sql.Date fechaSQLActual = new java.sql.Date(fechaActual.getTime());
	
		cita.setFecha(fechaSQLActual);
		cita.setPaciente(pacienteguardado);
		cita.setEspecialista(especialistaguardado);
		
		Cita citaguardada = citaservice.guardarCita(cita);
		System.out.println(citaguardada.getId());
		
		
	}
	*/
	
}
