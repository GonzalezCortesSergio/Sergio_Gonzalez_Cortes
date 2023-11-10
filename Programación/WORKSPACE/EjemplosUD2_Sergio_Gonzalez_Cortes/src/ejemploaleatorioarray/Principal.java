package ejemploaleatorioarray;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		//Crear array
		int numeros [];
		int tam= 10;
		int max= 99;
		int min= 1;
		//Instanciar array 
		
		numeros= new int[tam];
		
		Random r= new Random(System.nanoTime());
		
		//Rellenamos aleatoriamente
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i]= r.nextInt((max-min)+min);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i] + "\t\t");
		}
		
		// TODO Auto-generated method stub

	}

}
