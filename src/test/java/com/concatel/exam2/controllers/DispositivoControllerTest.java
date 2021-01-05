package com.concatel.exam2.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
class DispositivoControllerTest {

	
	private MockMvc mockMvc;
	
	@InjectMocks
	private DispositivoController dispositivoController;
	
	@Before
	void setUp() throws Exception {
		
		mockMvc = MockMvcBuilders.standaloneSetup(dispositivoController).build();
		
	}
	
	@Test
	void test() throws Exception {
		
		mockMvc.perform(get("/api/actual"))
		
				.andExpect(status().isOk());
			
		
	}

}
