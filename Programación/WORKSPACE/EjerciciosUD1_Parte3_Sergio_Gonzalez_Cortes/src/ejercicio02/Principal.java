package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String aux;
		String objeto;
		double espacio1;
		double velocidad;
		double espaciof;
		double tiempo;
		
		Scanner s= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Bienvenido, introduzca el nombre del objeto cuyo espacio recorrido "
				+ "quiere calcular");
		objeto= s.nextLine();
		
		System.out.printf("Ahora introduzca el espacio inicial en metros y la velocidad en metros segundo de %s\n", objeto);
		aux= s.nextLine();
		espacio1= Double.parseDouble(aux);
		aux= s.nextLine();
		velocidad= Double.parseDouble(aux);
		System.out.println("Ahora introduzca el tiempo que ha estado en movimiento en segundos");
		aux= s.nextLine();
		tiempo= Double.parseDouble(aux);
		
		espaciof= espacio1+velocidad*tiempo;
		
		System.out.printf("%s ha recorrido %.2f metros", objeto, espaciof);
	}

}
