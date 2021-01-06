package com.concatel.exam2.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.concatel.exam2.entity.Dispositivo;
import com.concatel.exam2.exceptions.DispositivoException;
import com.concatel.exam2.services.IDispositivoService;

class DispositivoControllerTest {

//	@Rule
  //  public MockitoRule rule = MockitoJUnit.rule();
	
	
	private static final Long DISPOSITIVO_ID = 1L;
	private static final Integer INICIALVALUE = new Integer(5);
		
	public static final Dispositivo DISPOSITIVO = new Dispositivo();
		
	
	@Mock 
	IDispositivoService iDispositivoService;
	
	@InjectMocks
	DispositivoController dispositivoController;
	
	@Before
	public void init() throws Exception {
		
		DISPOSITIVO.setIdDispositivo(DISPOSITIVO_ID);
		DISPOSITIVO.setValorInicial(INICIALVALUE);
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	
	@Test
	public void valorInicial() throws DispositivoException 
	
	{
		
		Mockito.doNothing().when(iDispositivoService).valorInicial(INICIALVALUE);
		
		ResponseEntity<Map<String,Object>> response = dispositivoController.valorInicial(new Integer(4));
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	
	
	@Test
	public void startTest() throws DispositivoException 
	
	{
		
		Mockito.doNothing().when(iDispositivoService).valorInicial(INICIALVALUE);
		
		ResponseEntity<Map<String,Object>> response = dispositivoController.start();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}

	
	@Test
	public void valorActual() 
	
	{
		
		Mockito.when(iDispositivoService.valorActual()).thenReturn(new Integer(4));
		
		System.out.println(DISPOSITIVO.getValorActual());
		
		
		ResponseEntity<Map<String,Object>> response = dispositivoController.valorActual();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	
	

}
