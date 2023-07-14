package com.gestion.EPS.modelos;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name="citas")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "America/Bogota")
	 private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "paciente_nombre", referencedColumnName = "cedula")
	Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "especialista_nombre", referencedColumnName = "cedula")
	Especialista especialista;
	
	
	
	public Cita() {
		
	}



	public Cita(Long id, Date fecha, Paciente paciente, Especialista especialista) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.paciente = paciente;
		this.especialista = especialista;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public Especialista getEspecialista() {
		return especialista;
	}



	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}




	
	
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	private Paciente paciente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Especialista especialista;
	*/
	
	
	

}
