package com.gestion.EPS.modelos;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.*;

@Entity
@Table(name = "especialistas")
public class Especialista {

	@Id
	private Long cedula;

	@Column(name = "nombres", length = 45, nullable = false)
	private String nombres;
	
	/*
	 * @Column(name = "apellidos", length = 45, nullable = false) private String
	 * apellidos;
	 * 
	 * @Column(name = "rh", length = 45, nullable = false) private String rh;
	 * 
	 * @Column(name = "telefono", length = 45, nullable = false) private String
	 * telefono;
	 * 
	 * @Column(name = "correo", length = 45, nullable = false) private String
	 * correo;
	 * 
	 * @Column(name = "departamento", length = 45, nullable = false) private String
	 * departamento;
	 * 
	 * @Column(name = "ciudad", length = 45, nullable = false) private String
	 * ciudad;
	 * 
	 * @Column(name = "direccion", length = 45, nullable = false) private String
	 * direccion;
	 */
	
	private boolean enabled = true;

	@ManyToOne(fetch =  FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@JoinColumn(name = "especialidadId", referencedColumnName = "especialidad_id")
	private Especialidad especialidad;
	
	public Especialista() {

	}

	public Especialista(Long cedula, String nombres, boolean enabled, Especialidad especialidad) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.enabled = enabled;
		this.especialidad = especialidad;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

}
