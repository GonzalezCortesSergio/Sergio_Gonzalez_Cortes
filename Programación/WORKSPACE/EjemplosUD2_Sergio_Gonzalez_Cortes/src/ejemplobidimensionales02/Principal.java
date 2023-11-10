package ejemplobidimensionales02;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int tabla [] [] ;
		
		
		
		String aux;
		int desde, hasta;
		int fil, col;
		int nuevafil;
		int nuevacol;
		int nuevonum;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		Random r= new Random(System.nanoTime());
		
		System.out.println("Número de filas");
		aux= s.nextLine();
		fil= Integer.parseInt(aux);
		
		System.out.println("Número de columnas");
		aux= s.nextLine();
		col= Integer.parseInt(aux);
		
		tabla= new int [fil] [col];
		
		System.out.println("Número menor");
		aux= s.nextLine();
		desde= Integer.parseInt(aux);
		
		System.out.println("Número mayor");
		aux= s.nextLine();
		hasta= Integer.parseInt(aux);
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				tabla [i] [j]= r.nextInt(hasta-desde+1)+desde;
			}
		}
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.print(tabla[i] [j]+ "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("Fila a cambiar");
		aux= s.nextLine();
		nuevafil= Integer.parseInt(aux)-1;
		
		System.out.println("Columna");
		aux= s.nextLine();
		nuevacol= Integer.parseInt(aux)-1;
		
		System.out.println("Nuevo número");
		aux= s.nextLine();
		nuevonum= Integer.parseInt(aux);
		
		tabla [nuevafil] [nuevacol]= nuevonum;
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.printf(tabla[i] [j]+ "\t");
			}
			System.out.println();
		}
	}

}
