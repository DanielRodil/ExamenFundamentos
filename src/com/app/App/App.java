package com.app.App;

import java.util.List;

import com.acing.Carrito;
import com.acing.Producto;

public class App {
	
	public static void main(String[] args) {

		Producto producto1 = new Producto(1, "12 latas Refresco", "Coca Cola", 6.01f);
		Producto producto2 = new Producto(2, "Leche Semidesnatada 1 litro", "President", 0.72f);
		Producto producto3 = new Producto(5, "Dentrífico", "Oral B", 1.99f);
		Producto producto4 = new Producto(8, "6 botellas 1,5 litro", "Font Vella", 2.99f);
		
		Carrito carrito = new Carrito();
		carrito.addProducto(producto1);
		carrito.addProducto(producto4);
		//System.out.println(carrito);
		
		
	}
}
