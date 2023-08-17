package com.gestion.EPS.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.EPS.modelos.Usuario;
import com.gestion.EPS.modelos.UsuarioRol;
import com.gestion.EPS.repositorios.RolRepositorio;
import com.gestion.EPS.repositorios.UsuarioRepositorio;
import com.gestion.EPS.servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	private RolRepositorio rolRepositorio;

	@Override
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
		Usuario usuarioLocal = usuarioRepositorio.findByUsername(usuario.getUsername());
		if(usuarioLocal != null) {
			System.out.println("El usuario ya existe");
			throw new Exception("El usuario ya esta presente");
			
		}else {
			
			for(UsuarioRol usuarioRol:usuarioRoles) {
				rolRepositorio.save(usuarioRol.getRol());
			}
			
			usuario.getUsuarioRoles().addAll(usuarioRoles);
			usuarioLocal = usuarioRepositorio.save(usuario);
			
		}
		
		return usuarioLocal;
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		return usuarioRepositorio.findByUsername(username);
	}
	
	
	
	
}