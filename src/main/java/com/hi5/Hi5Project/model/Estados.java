package com.hi5.Hi5Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estados {
	@Id
	private int cod_estado;
	private String estado;
	public int getCod_estado() {
		return cod_estado;
	}
	public void setCod_estado(int cod_estado) {
		this.cod_estado = cod_estado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
