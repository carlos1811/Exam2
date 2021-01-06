package com.concatel.exam2.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.concatel.exam2.entity.Dispositivo;

class DispositivoServiceImplTest {

	
	private static final Long DISPOSITIVO_ID = 1L;
	private static final Integer INICIALVALUE = new Integer(5);
		
	public static final Dispositivo DISPOSITIVO = new Dispositivo();
		
	
	//@Mock 
	//IDispositivoService iDispositivoService;
	
	@InjectMocks
	DispositivoServiceImpl dispositivoServiceImpl;
	
	@Before
	public void init() throws Exception {
		
		DISPOSITIVO.setIdDispositivo(DISPOSITIVO_ID);
		DISPOSITIVO.setValorInicial(INICIALVALUE);
		
		MockitoAnnotations.initMocks(this);
		
	}
	

	@Test
	void testValorActual() {
		
		DispositivoServiceImpl.dispositivo.setIdDispositivo(DISPOSITIVO_ID);
		DispositivoServiceImpl.dispositivo.setValorInicial(INICIALVALUE);
		DispositivoServiceImpl.dispositivo.setValorActual(INICIALVALUE);
		
		
		Integer resultado = dispositivoServiceImpl.valorActual();
		
		assertEquals(resultado, 5);
		
		
	}

}
