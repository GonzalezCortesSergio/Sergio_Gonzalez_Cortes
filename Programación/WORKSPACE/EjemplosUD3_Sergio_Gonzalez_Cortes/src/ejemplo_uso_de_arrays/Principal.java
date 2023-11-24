package ejemplo_uso_de_arrays;

import java.util.Scanner;

public class Principal {

	public static void main (String args []) {
		
		int hasta, desde, lista1 [], tam;
		String aux;
		
		Listas listado = new Listas();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Diga tamaño de la lista");
		
		aux = s.nextLine();
		
		tam = Integer.parseInt(aux);
		
		System.out.println("Diga desde");
		aux = s.nextLine();
		
		desde = Integer.parseInt(aux);
		
		System.out.println("Diga hasta");
		aux = s.nextLine();
		
		hasta = Integer.parseInt(aux);
		
		
		
		lista1= new int [tam];
		
		
			listado.rellenarAle(desde, hasta, lista1);	
			
			listado.mostrarLista(lista1);
			
			System.out.println();
			
			listado.mostrarLista(listado.trucarLista(lista1));
	}
}
