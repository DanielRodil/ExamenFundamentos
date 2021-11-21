package com.acing;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
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
	
	public float getValorCarrito(Carrito carrito) {
		float valor = 0;
		for (int i = 0; i < carrito.getCarrito().size(); i++) {
			valor += carrito.getCarrito().get(i).getPrecio();
		}
		return valor;
	}
	
	public void getInformeCarrito(Carrito carrito) {
		System.out.println(carrito.getCarrito().toString() + "\t El valor de carrito es de: " + 
				carrito.getValorCarrito(carrito) + " euros");
	}
	
	@Override
	public String toString() {
		return "" + carrito;
	}

	
}
