package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Variables
		
		String aux, codigoProducto, nombreProducto, seccionProducto;
		double porCosTransporte, precioFabrica;
		boolean fragil;
		int tam = 100, numProducto = 0, opcion;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciar Array y Tienda
		
		Producto [] lista = new Producto [tam];
		
		Tienda t = new Tienda (lista , 0);
		
		
	}

}
