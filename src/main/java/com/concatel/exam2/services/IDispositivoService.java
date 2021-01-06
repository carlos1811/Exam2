package com.concatel.exam2.services;

import com.concatel.exam2.exceptions.DispositivoException;

public interface IDispositivoService {
	
	
	public void start() throws DispositivoException;
	
	public Integer valorActual();

	public void valorInicial(Integer valorInicial) throws DispositivoException;
		

}
