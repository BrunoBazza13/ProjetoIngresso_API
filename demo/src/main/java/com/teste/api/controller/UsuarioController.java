package com.teste.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.entidades.Administrador;
import com.teste.api.model.entidades.Usuario;
import com.teste.api.model.entidades.UsuarioComum;
import com.teste.api.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	   private final UsuarioService usuarioService;

	    @Autowired
	    public UsuarioController(UsuarioService usuarioService) {
	        this.usuarioService = usuarioService;
	    }

	    @PostMapping
	    public ResponseEntity<Usuario> adicionarUsuarioAdm(Administrador novoUsuario) {
	    	Usuario usuarioAdicionado = usuarioService.adicionarUsuario(novoUsuario);
	    	
	        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioAdicionado);
	    }
	 
	    @PostMapping(path = "/cliente")
	    public ResponseEntity<Usuario> adicionarUsuarioComum(@RequestBody UsuarioComum novoUsuario) {
	    	Usuario usuarioAdicionado = usuarioService.adicionarUsuario(novoUsuario);
	    	
	        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioAdicionado);
	    }
	    
	    
	
}
