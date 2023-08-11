package com.gestion.EPS.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="especialistas")
public class Especialista {
	
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
	
	@ManyToOne(fetch =  FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "especialidadId", referencedColumnName = "especialidad_id")
    private Especialidad especialidad;
	
	@OneToMany(mappedBy = "especialista")
	@JsonIgnore
	List<Cita> listaEspecialista;
	
	
	/*
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "especialista")
	private Set<Cita>especialistaCita = new HashSet<>();
	*/
	public Especialista() {
		
	}

	

	public Especialista(long cedula, String nombres, String apellidos, String rh, String telefono, String correo,
			String departamento, String ciudad, String direccion, boolean enabled, Especialidad especialidad,
			List<Cita> listaEspecialista) {
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
		this.especialidad = especialidad;
		this.listaEspecialista = listaEspecialista;
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

	public List<Cita> getListaEspecialista() {
		return listaEspecialista;
	}

	public void setListaEspecialista(List<Cita> listaEspecialista) {
		this.listaEspecialista = listaEspecialista;
	}



	public Especialidad getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
	
	}
		
	

	