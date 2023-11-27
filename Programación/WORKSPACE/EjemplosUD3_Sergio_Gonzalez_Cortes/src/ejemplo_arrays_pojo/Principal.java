package ejemplo_arrays_pojo;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main (String args []) {
		
		
		int nVs = 0, seguir, tam = 100;
	
		String modelo;
	
		double potencia;
		
		int topePotencia;
	
		Vehiculo lista [] = new Vehiculo [tam];
	
		Concesionario c = new Concesionario (lista, 0);
		String aux;
		
		Scanner s = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce el modelo del vehículo: ");
			
			modelo = s.nextLine();
			
			System.out.println("Introduce la potencia");
			
			aux = s.nextLine();
			
			potencia = Double.parseDouble(aux);
			
			c.agregar(new Vehiculo (potencia, modelo));
			
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			
			aux = s.nextLine();
			
			seguir = Integer.parseInt(aux);
			
			
		}while (seguir != 0 && nVs < lista.length);
		
		for (int i = 0; i < c.getNvs(); i++) {
			System.out.println(lista[i].toString());
		}
		
		System.out.println("Indique el tope de potencia");
	
		aux = s.nextLine();
		
		topePotencia = Integer.parseInt(aux);
		
		c.mostrarEmpepinados(topePotencia);
	
	
	
	
	
	
	}
}
