package principal;

import crud.CrudProducto;
import modelo.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto [] lista;
		Producto p1;
		Producto p2;
		int tam = 10;
		CrudProducto cp;
		
		//Instancio dos objetos
		p1 = new Producto ("h12p86", "Alcaparras", 1.85, true);
		p2 = new Producto ("p21h68", "Lentejas", 3.65, true);
		
		//Instancio el array
		lista = new Producto [tam];
		//Instancio objeto de la clase crud pasando un array
		cp = new CrudProducto (lista);
		
		cp.agregar(p1, 0);
		cp.agregar(p2, 1);
	}

}
