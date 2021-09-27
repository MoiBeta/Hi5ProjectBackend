package com.hi5.Hi5Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ventas {
	@Id
	private int cod_venta;
	private double valor_subtotal;
	private double iva_total;
	private double valor_total;
	private int cod_cliente;
	private int cod_usuario;
	public int getCod_venta() {
		return cod_venta;
	}
	public void setCod_venta(int cod_venta) {
		this.cod_venta = cod_venta;
	}
	public double getValor_subtotal() {
		return valor_subtotal;
	}
	public void setValor_subtotal(double valor_subtotal) {
		this.valor_subtotal = valor_subtotal;
	}
	public double getIva_total() {
		return iva_total;
	}
	public void setIva_total(double iva_total) {
		this.iva_total = iva_total;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public int getCod_usuario() {
		return cod_usuario;
	}
	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
	
	
}
