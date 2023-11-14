package ejercicio07;

import java.util.Random;

public class Moneda {

	
	//Métodos
	
	public int lanzarMondeda () {
		
		int desde = 1, hasta = 2;
		
		Random r = new Random(System.nanoTime());
		
		return r.nextInt(hasta-desde+1)+desde;
	}
	
	public boolean comprobarMonedaCara (int moneda) {
		
		if (moneda == 1 ) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public void mostrarGanador (int moneda) {
		
		boolean caraMoneda;
		
		caraMoneda = comprobarMonedaCara(moneda);
		if (caraMoneda == true) {
			
			System.out.println("Cara");
		}
		
		else {
			
			System.out.println("Cruz");
		}
	}
	
	public boolean comprobarRepeticion (int moneda, int monedaJugador) {
		
		if (moneda == monedaJugador) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}
	public void mostrarRepeticion (int moneda, int monedaJugador) {
		
		boolean repetir;
		repetir = comprobarRepeticion(moneda, monedaJugador);
		
		if (repetir == true) {
			
			System.out.println("¡¡¡Has ganado!!!");
		}
		
		else {
			
			System.out.println("Ohhh, has perdido, vuelve a intentarlo ^^");
		}
	}
}
