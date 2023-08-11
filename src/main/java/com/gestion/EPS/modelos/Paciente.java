package com.gestion.EPS.modelos;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="pacientes")
public class Paciente {
	
	@Id
	private long cedula;
	
	@Column(name = "nombres", length = 45, nullable = false)
	private String nombres;
	
	@Column(name = "apllidos", length = 45, nullable = false)
	private String apellidos;
	
	@Column(name = "rh", length = 45, nullable = false)
	private String rh;
	
	@Column(name = "telefono", length = 45, nullable = false)
	private String telefono;
	
	@Column(name = "correo", length = 45, nullable = false)
	private String correo;
	
	@Column(name = "departamento", length = 45, nullable = false)
	private String departamento;
	
	@Column(name = "ciudad", length = 45, nullable = false)
	private String ciudad;
	
	@Column(name = "direccion", length = 45, nullable = false)
	private String direccion;
	
	private boolean enabled = true;

	@OneToMany(mappedBy = "paciente")
	@JsonIgnore
	List<Cita> listaPaciente;
	
	/*
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "paciente")
	private Set<Cita> pacienteCita = new HashSet<>();
	*/
	public Paciente () {
		
	}

	public Paciente(long cedula, String nombres, String apellidos, String rh, String telefono, String correo,
			String departamento, String ciudad, String direccion, boolean enabled, List<Cita> listaPaciente) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rh = rh;
		this.telefono = telefono;
		this.correo = correo;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.enabled = enabled;
		this.listaPaciente = listaPaciente;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<Cita> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(List<Cita> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}
	
	

}