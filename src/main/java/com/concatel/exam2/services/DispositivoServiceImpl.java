package com.concatel.exam2.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.concatel.exam2.entity.Dispositivo;
import com.concatel.exam2.exceptions.DispositivoException;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service
public class DispositivoServiceImpl implements IDispositivoService{

	private static final Logger logger = LoggerFactory.getLogger(ClassName.class);
	

	public static Dispositivo dispositivo = new Dispositivo();
	
	@Override
	public void start() throws DispositivoException {
		logger.info("inicio metodo start ");
		try {
		for (int i = dispositivo.getValorInicial() ; i >= 0; i--)
		{
				Thread.sleep(1000);
				System.out.println("Tiempo que queda " +	i);
				
			dispositivo.setValorActual(i);
		}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("fin metodo start ");
	}

	@Override
	public void valorInicial(Integer valorInicial) throws DispositivoException {
		logger.info("inicio metodo valorInicial ");
		dispositivo.setValorInicial(valorInicial);
		logger.info("fin metodo valorInicial ");
		
	}

	@Override
	public Integer valorActual() {
		logger.info("inicio metodo valorActual ");
		
		
		return dispositivo.getValorActual();
	}



}
