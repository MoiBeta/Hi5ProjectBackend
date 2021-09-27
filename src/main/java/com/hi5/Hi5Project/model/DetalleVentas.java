package com.hi5.Hi5Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetalleVentas {
	@Id
	private int cod_det_venta;
	private int cantidad_producto;
	private double valor_unitario;
	private int cod_producto;
	private int cod_venta;
	public int getCod_det_venta() {
		return cod_det_venta;
	}
	public void setCod_det_venta(int cod_det_venta) {
		this.cod_det_venta = cod_det_venta;
	}
	public int getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public double getValor_unitario() {
		return valor_unitario;
	}
	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	public int getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}
	public int getCod_venta() {
		return cod_venta;
	}
	public void setCod_venta(int cod_venta) {
		this.cod_venta = cod_venta;
	}
	
}
