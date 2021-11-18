package com.acing;

import java.util.ArrayList;
import java.util.List;

public class Carrito implements Describible, Valorable {
	private List<Producto> carrito;

	public List<Producto> getCarrito() {
		return carrito;
	}
	
	public Carrito() {
		this.carrito = new ArrayList<Producto>();
	}
	
	public void addProducto(Producto producto) {
		this.carrito.add(producto);
	}
	
	public boolean isCargadoProducto (Producto producto) {
		return this.carrito.contains(producto);
	}
	
	@Override
	public String toString() {
		return "Carrito [carrito=" + carrito + "]";
	}

	@Override
	public float getPrecio() {
		return 0;
	}

	@Override
	public String getDescripcion() {
		return null;
	}

	
}
