package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		
		double producto= 12.99;
		double unidades= 4;
		double preciototal= 0;
		double preciodes= 0;
		double des= 0.97;
		
		System.out.println("////////////////////////////////////////////////////////////////////"
				+ "///////////////");
		System.out.println("	Bienvenido, este programa va a calcular el precio"
				+ "final de su compra");
		System.out.println("////////////////////////////////////////////////////////////////////"
				+ "///////////////");
		System.out.println("Se logra ver que usted tiene un descuento de un 3%");
		
		preciototal= producto*unidades;
		preciodes= preciototal*des;
		
		
		System.out.printf("Su precio final es de %.2f euros.\n", preciodes);
		
		System.out.println("********************************************************************"
				+ "***************");
		System.out.println("Gracias por utilizar el programa.");

	}

}
