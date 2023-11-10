package ejemploarrays02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int edades []; //Declaración de array
		int tam;
		int suma= 0;
		int opcion;
		String aux;
		
		//Insertar scanner
		Scanner s= new Scanner(System.in);
		
		//Pedir tamaño
		System.out.println("Diga tamaño");
		aux= s.nextLine();
		tam= Integer.parseInt(aux);
		
		//Instanciar array
		edades= new int [tam];
		
		System.out.println("Introduzca edad");
		//Rellenar o cargar
		for (int i = 0; i < edades.length; i++) {
			
			aux= s.nextLine();
			edades [i]= Integer.parseInt(aux);
			
		}
		
		//Mostrar
		for (int i = 0; i < edades.length; i++) {
			
			
			System.out.println(edades[i]);
			
		}
		
		//Sumar todos los elementos
		
		for (int i = 0; i < edades.length; i++) {
			
			suma= edades[i] + suma;
			
			
		}
		
		System.out.println(suma);
		
		
		//Cada vez que hagamos una operación con array se hará con un bucle diferente 
		
		
		//Mostrar un elemento elegido
		
		System.out.println("Diga que posición quiere mostrar");
		aux= s.nextLine();
		opcion= Integer.parseInt(aux)-1;
		
		System.out.println(edades[opcion]);
		
		System.out.println("Qué posición quiere cambiar");
		
		aux= s.nextLine();
		opcion= Integer.parseInt(aux)-1;
		
		System.out.println("Por cuál número quiere cambiarlo");
		aux= s.nextLine();
		edades[opcion]= Integer.parseInt(aux);
		
		System.out.println("Ha sido cambiado correctamente a "+ edades[opcion]);
	}

}
