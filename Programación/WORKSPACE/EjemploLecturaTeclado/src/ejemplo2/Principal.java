package ejemplo2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		
		System.out.println("Bienvenido, introduzca su nombre");
		
		nombre=Leer.dato();
		
		System.out.printf("Hola %s, gracias por usar el programa", nombre);
		
		

	}

}
