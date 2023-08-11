package com.gestion.EPS.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.EPS.modelos.Usuario;
import com.gestion.EPS.servicios.UsuarioService;

@RestController
@RequestMapping("/usuario/")
@CrossOrigin(origins = "http://localhost:4200/")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
@GetMapping("/{username}")
public Usuario obtenerUsuario(@PathVariable("username")String username) {
	return usuarioService.obtenerUsuario(username);
}
	
}
