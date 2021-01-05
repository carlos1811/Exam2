package com.concatel.exam2.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.concatel.exam2.services.IDispositivoService;

class DispositivoControllerTest {

//	@Rule
  //  public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock 
	IDispositivoService iDispositivoService;
	
	@InjectMocks
	DispositivoController dispositivoController;
	
	
	@Before
	public void init() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void startTest() 
	
	{
		
		final ResponseEntity<Map<String,Object>> response = dispositivoController.start();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	
	
	@Test
	public void valorInicial() 
	
	{
		
		final ResponseEntity<Map<String,Object>> response = dispositivoController.valorInicial(4);
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	
	
	@Test
	public void valorActual() 
	
	{
		
		final ResponseEntity<Map<String,Object>> response = dispositivoController.valorActual();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	
	

}
