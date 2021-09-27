package com.hi5.Hi5Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoProducto {
	@Id
	private int cod_tipo_producto;
	private String tipo_producto;
	
	public int getCod_tipo_producto() {
		return cod_tipo_producto;
	}
	public void setCod_tipo_producto(int cod_tipo_producto) {
		this.cod_tipo_producto = cod_tipo_producto;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	
	
}
