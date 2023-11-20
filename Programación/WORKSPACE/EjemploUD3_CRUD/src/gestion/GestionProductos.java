package gestion;

import modelo.Producto;


public class GestionProductos {

	
	//Atributos
	
	//(Deberíamos tener una lista de productos, y sólo se ha puesto uno como ejemplo)
	private Producto p;
	
	
	
	//Constructor
	public GestionProductos (Producto p) {
		
		this.p = p;
	}
	
	//Métodos
	
	public double calcularLinea (int cantidad) {
		
		double subTotal = 0;
		
		subTotal = cantidad*p.getPrecioUnitario();
		
		return subTotal;
		
		//Este método no se puede considerar correcto; pues no se realiza en función de la lista. O sea,
		//Realiza el subTotal de un solo producto.
	}
	
	public double calcularConDescuento (double descuento , int cantidad, int tope) {
		
		double cien = 100;
		if (cantidad >= tope ) {
			return calcularLinea (cantidad)-calcularLinea (cantidad)*descuento/cien;
		
		}
		
		else {
			
			return calcularLinea (cantidad);
		}
	}
}


	
