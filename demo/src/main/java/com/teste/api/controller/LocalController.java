package com.teste.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teste.api.model.dto.LocalDTO;
import com.teste.api.model.entidades.Local;
import com.teste.api.service.LocalService;

@RestController
@RequestMapping("/api/local")
public class LocalController {
	
	@Autowired
	private LocalService localService;
	
	@PostMapping
	public ResponseEntity<Local> setLocal(@RequestBody Local novoLocal) {
		Local localAdicionado = localService.adicionaLocal(novoLocal);
		return ResponseEntity.status(HttpStatus.CREATED).body(localAdicionado);
	}
	
	
	@GetMapping("puscaPorId/{id}")
	public ResponseEntity<LocalDTO> getLocalPorID(@PathVariable int id){
		LocalDTO localDTO = localService.buscarLocalPorID(id);
		
		return new ResponseEntity<LocalDTO>(localDTO,HttpStatus.OK);
	}
	
	
	public ResponseEntity<List<LocalDTO>> getLocal(){
	 List<LocalDTO> localDTO = localService.bucarLocal();
	 
	 return new ResponseEntity<List<LocalDTO>>(localDTO, HttpStatus.OK);
		
	}
	

}
