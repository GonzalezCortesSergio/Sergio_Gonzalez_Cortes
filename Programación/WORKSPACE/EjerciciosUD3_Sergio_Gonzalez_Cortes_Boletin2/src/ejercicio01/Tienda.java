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
	
	
	
	
}
