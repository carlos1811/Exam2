package com.concatel.exam2.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.FormParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.concatel.exam2.services.IDispositivoService;

import javassist.bytecode.stackmap.TypeData.ClassName;


@RestController
@RequestMapping("/api")
public class DispositivoController {

	private static final Logger logger = LoggerFactory.getLogger(ClassName.class);
	
	@Autowired
	private IDispositivoService dispositivoService;
	
	
	@PostMapping("/start")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Map<String,Object>> start()
	{
		
		logger.info("inicio metodo start ");
		
		Map<String,Object> response = new HashMap<>();
					
		try {
		dispositivoService.start();
		} catch (RuntimeException e) {
			response.put("errors",e.getMessage());
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CONFLICT);
		}
		
		response.put("mensaje", "Cuenta atras finalizada");
		
		return  new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	
	
	@GetMapping("/actual")
	public  ResponseEntity<Map<String,Object>> valorActual()  
		
	{
		logger.info("inicio metodo valorActual ");
		
		Map<String,Object> response = new HashMap<>();
		
		
		Integer tiempoRestante = dispositivoService.valorActual();
		
		response.put("tiempo",tiempoRestante);
		
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	
		
	@PostMapping("/inicial")
	public ResponseEntity<Map<String,Object>> valorInicial(@FormParam("valor") Integer valor)
	{
		logger.info("inicio metodo update ");
		
		Map<String,Object> response = new HashMap<>();
		
		try {
		
			dispositivoService.valorInicial(valor);
				
		} catch (RuntimeException e) {
			response.put("errors",e.getMessage());
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CONFLICT);
		}
		
		return  new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}	
	
	
}
