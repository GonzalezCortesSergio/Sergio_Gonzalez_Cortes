package ejemplo_uso_de_arrays;

import java.util.Random;

public class Listas {

	
	public void rellenarAle (int desde, int hasta, int lista1 [] ) {
		
		Random r = new Random(System.nanoTime());
		
		for (int i = 0; i < lista1.length; i++) {
			
			lista1 [i] = r.nextInt(hasta-desde+1)+desde;
		}
	}
	
	public void mostrarLista (int lista1 []) {
		
		for (int i = 0; i < lista1.length; i++) {
			
			System.out.print(" "+lista1[i]);
		}
	}
	
	/*Podría haber dos versiones, una pasando la lista
	 * como parámetro y otra instanciando la lista
	 * dentro del método.
	 */
	public int [] trucarLista (int lista[]) {
		
		
		int diez = 10;
		
		for (int i = 0; i < lista.length; i++) {
			lista [i] = diez;
		}
		
		return lista;
	}
}
