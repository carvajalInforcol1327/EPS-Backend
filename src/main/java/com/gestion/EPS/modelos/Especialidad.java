package com.gestion.EPS.modelos;
import jakarta.persistence.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "especialidades")
public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long especialidad_id;

	@Column(nullable = false, length = 150)
	private String nombre;

	@Column(nullable = false, length = 150)
	private String observaciones;
	
	private boolean enabled = true;
	
	public Especialidad() {
	}

	public Especialidad(long especialidad_id, String nombre, String observaciones, boolean enabled) {
		super();
		this.especialidad_id = especialidad_id;
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.enabled = enabled;
	}

	public long getEspecialidad_id() {
		return especialidad_id;
	}

	public void setEspecialidad_id(long especialidad_id) {
		this.especialidad_id = especialidad_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}