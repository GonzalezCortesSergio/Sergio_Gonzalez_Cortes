package crud;

import java.util.Arrays;

import modelo.Producto;

public class CrudProducto {

	//Atributos
	private Producto [] lista;
	
	/*
	 * Constructor para crear un objeto de esta clase pasando
	 * como parámetro una lista
	 * que ya puede tener tamaño dado por el usuario en el main
	 */
	//Constructor
	
	public CrudProducto (Producto [] lista) {
		
		this.lista = lista;
	}

	
	//Getters and Setters
	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}


	
	//To String
	
	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	
	/*
	 * Pasamos un producto y una posición y se añade dicho producto en dicha
	 */
	
	public void agregar (Producto p, int posicion) {
		
		lista[posicion] = p;
		
		/*Este parámetro está asignando un valor p (producto) a la lista 
		 * en la posición escogida.
		 */
	}
	
	public Producto findByCodigo(String codigo) {
		
		int i = 0;
		boolean encontrado = false;
		//Mientras no hayamos llegado al final o encontrado lo que buscamos, sigue el bucle
		//Al encontrarlo, el bucle para
		
		while (i< lista.length && !encontrado) {
			
			Producto deLista = lista[i];
			
			/*.equalsIgnoreCase compara el valor que se encuentra dentro de una
			dirección de memoria ignorando las mayúsculas, a diferencia de "==",
			que de usarlo compararía directamente las direcciones de memoria */
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) {
				
				encontrado = true;
			}
			
			else {
				
				i++;
			}
		}
		
		if (encontrado) {
			
			return lista[i]; //Devolvemos el producto buscado
			
		}
		
		else {
			
			return null;
		}
	}
	
	public int findByCodigoV2(String codigo) {
		
		//Esta posibilidad en lugar de fijarse en un objeto, busca devolver un int
		
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) {
				
				encontrado = true;
			}
			
			else {
				
				i++;
			}
		}
		
		if (encontrado) {
			
			return i;
		}
		
		else {
			
			return -1;
		}
	}
	
	/*
	 * Método que modifica el precio de un producto.
	 * 	Se pasa como parámetros el código del producto que queremos modificar
	 * 	(ambas cosas se le pedirán al usuario por teclado en el main,
	 * 	se busca dentro del método el producto por código y se le "setea"
	 * 	Podría devolver boolean si todo es correcto o algún índice
	 * 	pero en nuetro caso, en este programa tan sencillo no es necesario
	 */
	
	public void editPrecio (String codigo, double precioN) {
		
		int index = findByCodigoV2 (codigo);
		
		if (index >= 0) {
			
			lista[index].setPrecioUnitario(precioN);
		}
	}
	
	
	 
	
	//Mostrar todos los productos de la lista
	
	public void imprimirTodosLosProductos () {
		
		for(int i = 0; i<lista.length; i++) {
			
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	//Mostrar solo los productos cuyo atributo activo es true, es decir,
	//están a la venta
	
	public void imprimirSoloActivos () {
		
		for(int i = 0; i < lista.length; i++) {
			
			if (lista[i].isActivo()) {
				
				
			}
		}
	}
	
	
}
