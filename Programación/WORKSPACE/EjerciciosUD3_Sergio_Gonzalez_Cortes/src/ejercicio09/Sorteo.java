package ejercicio09;

import java.util.Random;

public class Sorteo {

	
	//Métodos
	
	public int generarNumero () {
		int desde = 00001;
		int hasta = 99999;
		
		Random r = new Random(System.nanoTime());
		
		return r.nextInt(hasta-desde)+desde;
		 
	}
	
	public int hacerSorteo () {
		
		return generarNumero();
		
	}
	
	public boolean comprobarGanador (int numeroElegido, int numeroGanador) {
		
		if (numeroElegido == numeroGanador) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public void mostrarGanador (int numeroElegido, int numeroGanador) {
		
		if (comprobarGanador(numeroElegido, numeroGanador) == true) {
			
			System.out.println("¡Has ganado, felicidades!");
			System.out.println("¡¡El número ganador es "+numeroGanador+"!!");
		}
		
		else {
			
			System.out.println("Has perdido, una lástima...");
			System.out.println("El número ganador es "+numeroGanador+"...");
			
		}
	}
}
