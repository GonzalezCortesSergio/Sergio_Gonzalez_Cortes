package ejercicio01;

public class Tienda {

	
	//Atributos
	
	private Producto [] lista;
	private int numProductos;
	
	
	//Constructor
	public Tienda(Producto[] lista, int numProductos) {
		
		this.lista = lista;
		this.numProductos = numProductos;
	}


	
	//Getters and Setters
	
	public Producto[] getLista() {
		return lista;
	}


	public void setLista(Producto[] lista) {
		this.lista = lista;
	}


	public int getNumProductos() {
		return numProductos;
	}


	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
	
	
	//Métodos
	
	public void agregarProducto (Producto p) {
		
		
		lista [numProductos] = p;
		
		
		
		numProductos++;
		
	}
	
	public boolean comprobarFragil (int opcionFragil) {
		
		if (opcionFragil == 1) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
			
		}
		
		
	}
	
	public double calcularCantidadInvertida () {
		
		double suma = 0;
		
		for (int i = 0; i < numProductos; i++) {
			
			suma = suma + lista[i].getPrecioFabrica();
		}
		return suma;
	}
	
	public double calcularTotalPVP (double pvp) {
		
		double suma = 0;
		int cien = 100;
		
		for (int i = 0; i < numProductos; i++) {
			
			suma+= (lista[i].calcularPCoste()+(lista[i].calcularPCoste()*pvp/cien));
		}
		
		return suma;
		
	}
	
	public double calcularTotalPFabrica () {
		
		double suma = 0;
		int cien = 100;
		
		for (int i = 0; i < numProductos; i++) {
			
			suma+= lista[i].getPrecioFabrica();
			
		}
		
		return suma;
	}
	
	
	public void calcularGanancias (double pvp) {
		double ganancias;
		
		ganancias = calcularTotalPVP(pvp) - calcularTotalPFabrica();
		System.out.printf("Usted tiene una ganancia de %.2f€", ganancias);
		
	}
	
	
	
	
}
