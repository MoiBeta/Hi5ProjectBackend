package com.hi5.Hi5Project.model;

import java.sql.Blob;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
	@Id
	private int cod_producto;
	private String nombre_producto;
	private double precio_com_producto;
	private double iva_producto;
	private double precio_ven_producto;
	private Blob imagen;
	private int cod_proveedores;
	private int cod_tipo_producto;
	private int cod_mar_producto;
	public int getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public double getPrecio_com_producto() {
		return precio_com_producto;
	}
	public void setPrecio_com_producto(double precio_com_producto) {
		this.precio_com_producto = precio_com_producto;
	}
	public double getIva_producto() {
		return iva_producto;
	}
	public void setIva_producto(double iva_producto) {
		this.iva_producto = iva_producto;
	}
	public double getPrecio_ven_producto() {
		return precio_ven_producto;
	}
	public void setPrecio_ven_producto(double precio_ven_producto) {
		this.precio_ven_producto = precio_ven_producto;
	}
	public Blob getImagen() {
		return imagen;
	}
	public void setImagen(Blob imagen) {
		this.imagen = imagen;
	}
	public int getCod_proveedores() {
		return cod_proveedores;
	}
	public void setCod_proveedores(int cod_proveedores) {
		this.cod_proveedores = cod_proveedores;
	}
	public int getCod_tipo_producto() {
		return cod_tipo_producto;
	}
	public void setCod_tipo_producto(int cod_tipo_producto) {
		this.cod_tipo_producto = cod_tipo_producto;
	}
	public int getCod_mar_producto() {
		return cod_mar_producto;
	}
	public void setCod_mar_producto(int cod_mar_producto) {
		this.cod_mar_producto = cod_mar_producto;
	}
	
	

}
