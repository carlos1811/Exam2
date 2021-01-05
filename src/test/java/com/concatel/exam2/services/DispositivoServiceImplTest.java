package com.concatel.exam2.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DispositivoServiceImplTest {

	@Autowired
	private DispositivoServiceImpl dispositivoServiceImpl;
		
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testStart() {
		fail("Not yet implemented");
	}

	@Test
	void testValorInicial() {

		fail("Not yet implemented");
	}

	@Test
	void testValorActual() {
		
		DispositivoServiceImpl.dispositivo.setValorActual(5);
		
		Integer resultado = dispositivoServiceImpl.valorActual();
		
		Assertions.assertEquals(5, resultado);
	}

}
