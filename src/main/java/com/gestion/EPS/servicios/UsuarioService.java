package com.gestion.EPS.servicios;

import com.gestion.EPS.modelos.Usuario;
import com.gestion.EPS.modelos.UsuarioRol;
import java.util.Set;
import java.util.HashSet;

public interface UsuarioService {

	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	
	public Usuario obtenerUsuario(String username);
	
	
}
