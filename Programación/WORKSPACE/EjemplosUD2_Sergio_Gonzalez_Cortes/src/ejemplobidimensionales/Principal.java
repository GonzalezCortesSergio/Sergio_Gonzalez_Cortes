package ejemplobidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int [] [] mitabla;
		
		int fil, col;
		
		String [] asignaturas= {"PR", "LM", "BD", "ED"} ;
		
		String aux;
		
		int desde;
		int hasta;
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner (System.in);
		Random r= new Random(System.nanoTime());
		
		System.out.println("Introduzca el número de filas que quiere");
		aux= s.nextLine();
		fil= Integer.parseInt(aux);
		
		System.out.println("Introduzca el número de columnas que quiere");
		aux= s.nextLine();
		col= Integer.parseInt(aux);
		
		System.out.println("Introduzca desde qué número hasta qué número se van a generar aleatoriamente");
		aux= s.nextLine();
		desde= Integer.parseInt(aux);
		aux= s.nextLine();
		hasta= Integer.parseInt(aux);
		
		mitabla= new int [fil] [col];
		
		for (int i = 0; i < mitabla.length; i++) {
			
			for (int j = 0; j < mitabla[i].length; j++) {
				
				mitabla [i] [j]= r.nextInt(hasta-desde+1)+desde;
				
			}
		}
		for (int i = 0; i < mitabla.length; i++) {
			
			for (int j = 0; j < mitabla[i].length; j++) {
				
				System.out.print(mitabla[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		


	}

}
