package com.hi5.Hi5Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MarcaProducto {
	@Id
	private int cod_mar_producto;
	private String marca_producto;
	
	public int getCod_mar_producto() {
		return cod_mar_producto;
	}
	public void setCod_mar_producto(int cod_mar_producto) {
		this.cod_mar_producto = cod_mar_producto;
	}
	public String getMarca_producto() {
		return marca_producto;
	}
	public void setMarca_producto(String marca_producto) {
		this.marca_producto = marca_producto;
	}
	
	
}
