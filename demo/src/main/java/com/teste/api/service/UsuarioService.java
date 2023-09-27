package com.teste.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.entidades.Administrador;
import com.teste.api.model.entidades.Usuario;
import com.teste.api.model.entidades.UsuarioComum;
import com.teste.api.model.repositorie.UsuarioRepository;

@Service
public class UsuarioService {

	 private final UsuarioRepository usuarioRepository;

	    @Autowired
	    public UsuarioService(UsuarioRepository usuarioRepository) {
	        this.usuarioRepository = usuarioRepository;
	    }

	    public Usuario adicionarUsuario(Usuario novoUsuario) {
	        // Você pode realizar validações ou lógica de negócios aqui, se necessário.
	        
	        // Salva o novo usuário no banco de dados
	        return usuarioRepository.save(novoUsuario);
	    }

	 
}

