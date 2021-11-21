package com.acing;

public class Producto implements Comerciable, Comparable<Producto> {
	private int iD;
	private String descripcion;
	private String marca;
	private Float precio;
	
	public int getID() {
		return iD;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public Producto() {
	}

	public Producto(String descripcion, String marca, Float precio) {
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}

	public Producto(int iD, String descripcion, String marca, Float precio) {
		this(descripcion, marca, precio);
		this.iD = iD;
	}
	
	@Override
	public String toString() {
		return "ID (int): " + iD + " | Descripcion - Marca: " + descripcion + 
				" - " + marca + " | Precio (€): " + precio + System.lineSeparator();
	}
	
	@Override
	public int compareTo(Producto producto) {
		return getPrecio().compareTo(producto.getPrecio());
		
	}
                
}
