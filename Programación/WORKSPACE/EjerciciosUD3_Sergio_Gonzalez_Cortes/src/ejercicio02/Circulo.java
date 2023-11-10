package ejercicio02;

public class Circulo {

	
	//Atributos
	
	private double radio;
	
	
	//Constructor
	
	public Circulo (double radio) {
		
		this.radio = radio;
	}
	
	//Acciones
	
	public double calcularArea () {
		
		double area;
		int cuadrado= 2;
		area= Math.PI*Math.pow(radio, cuadrado);
		
		return area;
		
	}
	
	public void mostrarResultado (double area) {
		
		System.out.printf("El área del círculo es de %.2fcm²", area);
	}
	
	
}
