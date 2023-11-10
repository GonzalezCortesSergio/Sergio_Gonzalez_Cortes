package ejercicio03;

public class Operaciones {

	
	//Acciones
	public boolean mirarValor (int entero) {
		
		boolean valorPositivo;
		
		if (entero < 0) {
			
			valorPositivo = false;
		}
		
		else {
			
			valorPositivo = true;
			
		}
		
		return valorPositivo;	
		
	}
	
	public void mostrarValor () {
		
		
	}
	
	public void mirarParImpar (int entero) {
		
		int dos = 2;
		
		if (entero % dos == 0 ) {
			
			System.out.println("El número es par");
		}
		
		else {
			
			System.out.println("El número es impar");
		}
	}
}
