package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		double radiocircun= 3;
		double radiocircul= 5.2;
		double constante= 2;
		double longicircun= 0;
		double areacircul= 0;
		
		System.out.println("	Bienvenido, este programa va a calcular"
				+ " la longitud de una circunferencia y el área de un círculo");
		System.out.println("////////////////////////////////////////////////////////////////////////////"
				+ "/////////////////////////////////////");
		longicircun= constante * Math.PI * radiocircun;
		System.out.printf("La longitud de una circunferencia de %.0f metros de radio es de %.2f metros.\n", radiocircun, longicircun);
		
		areacircul= Math.PI * Math.pow(radiocircul,constante);
		
		System.out.printf("El área de un círculo de %.0f metros de radio es de %.2f metros cúbicos.\n", radiocircul, areacircul);
		
		System.out.println("Gracias por utilizar el programa.");
	}

}
