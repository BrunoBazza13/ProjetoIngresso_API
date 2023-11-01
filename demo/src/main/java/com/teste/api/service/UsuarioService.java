package com.teste.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.api.model.entidades.UsuarioComum;
import com.teste.api.model.repositorie.UsuarioRepository;

@Service
public class UsuarioService {

	 private final UsuarioRepository usuarioRepository;

	    @Autowired
	    public UsuarioService(UsuarioRepository usuarioRepository) {
	        this.usuarioRepository = usuarioRepository;
	    }

	    public UsuarioComum adicionarUsuario(UsuarioComum novoUsuario) {
	        return usuarioRepository.save(novoUsuario);
	    }

	    public UsuarioComum obterUsuarioPorId(int id) {
	        return usuarioRepository.findById(id).orElse(null);
	    }
	    
}

