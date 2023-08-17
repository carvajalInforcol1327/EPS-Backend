package com.gestion.EPS.modelos;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	private Long documento;
	
	@Column(name = "tipo_documento", length = 45, nullable = false)
	private String tipodocumento;
	
	@Column(name = "contrasena", length = 45, nullable = false)
	private String contrasena;
	
	@Column(name = "username", length = 45, nullable = false)
	private String username;
	
	@Column(name = "nombre1", length = 45, nullable = false)
	private String nombre1;
	
	@Column(name = "nombre2", length = 45, nullable = false)
	private String nombre2;
	
	@Column(name = "apellido1", length = 45, nullable = false)
	private String apellido1;
	
	@Column(name = "apellido2", length = 45, nullable = false)
	private String apellido2;
	
	@Column(name = "correo", length = 45, nullable = false)
	private String correo;
	
	@Column(name = "sexo", length = 45, nullable = false)
	private String sexo;
	
	private boolean enabled = true;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "usuario")
	@JsonIgnore
	private Set<UsuarioRol> usuarioRoles = new HashSet<>();
	
	public Usuario() {
		
	}

	public Usuario(Long documento, String tipodocumento, String contrasena, String username, String nombre1,
			String nombre2, String apellido1, String apellido2, String correo, String sexo, boolean enabled,
			Set<UsuarioRol> usuarioRoles) {
		super();
		this.documento = documento;
		this.tipodocumento = tipodocumento;
		this.contrasena = contrasena;
		this.username = username;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
		this.sexo = sexo;
		this.enabled = enabled;
		this.usuarioRoles = usuarioRoles;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UsuarioRol> getUsuarioRoles() {
		return usuarioRoles;
	}

	public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}

	
}