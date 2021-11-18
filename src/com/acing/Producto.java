package com.acing;

public class Producto {
	private int iD;
	private String descripcion;
	private String marca;
	private float precio;
	
	public int getID() {
		return iD;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public Producto() {
	}

	public Producto(String descripcion, String marca, float precio) {
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}

	public Producto(int iD, String descripcion, String marca, float precio) {
		this(descripcion, marca, precio);
		this.iD = iD;
	}

	@Override
	public String toString() {
		return "Producto [iD=" + iD + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio + "]";
	}
                
}
