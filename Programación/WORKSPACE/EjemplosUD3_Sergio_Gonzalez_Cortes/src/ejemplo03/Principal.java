package ejemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		String nombre;
		double precio;
		int numRuedas;
		double precioNuevo;
		String aux;
		Vehiculo v;
		
		//Instanciar Scanner
		Scanner s = new Scanner(System.in);
		
		//Pedir datos
		
		System.out.println("Introduzca nombre");
		nombre = s.nextLine();
		System.out.println("Introduzca precio");
		aux = s.nextLine();
		precio = Double.parseDouble(aux);
		System.out.println("Introduzca número ruedas");
		aux = s.nextLine();
		numRuedas = Integer.parseInt(aux);
		
		
		//Instanciar objeto
		
		v = new Vehiculo (nombre, precio, numRuedas);
		
		//Mostrar
	/*	
		System.out.println(v);
		
		System.out.println(nombre);
		
		//System.out.println(v.nombre);
		
		System.out.println(v.getNombre());
		
		//Modificar
		
		System.out.println("Diga nuevo precio");
		
		aux = s.nextLine();
		precioNuevo = Double.parseDouble(aux);
		v.setPrecio(precioNuevo);
		
		System.out.printf("El nuevo precio es %.2f",v.getPrecio()); */
		
		Vendedor v1 = new Vendedor ("Luis", 12000.00, 2);
		System.out.println(v1);
	}

}
