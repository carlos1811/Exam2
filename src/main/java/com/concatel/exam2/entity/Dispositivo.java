package com.concatel.exam2.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dispositivo")
public class Dispositivo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_dispositivo")
	private Long idDispositivo;
	
	private Integer valorInicial = 0  ;
	
	private Integer valorActual = 0 ;
	
	
	public Dispositivo(Long idDispositivo, Integer valorInicial, Integer valorActual) {
		super();
		this.idDispositivo = idDispositivo;
		this.valorInicial = valorInicial;
		this.valorActual = valorInicial;
	}

	public Dispositivo() {

	}

	public Long getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(Long idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public Integer getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Integer valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Integer getValorActual() {
		return valorActual;
	}

	public void setValorActual(Integer valorActual) {
		this.valorActual = valorActual;
	}
	

}
