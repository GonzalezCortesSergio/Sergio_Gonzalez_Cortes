package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String aux;
		float constante1= 61.412f;
		float constante2= 2.317f;
		float longitudTibia;
		short edad;
		float altura;
		float constante3= 0.06f;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("////////////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido, introduzca la longitud de la tibia de la mujer fallecida");
		System.out.println("////////////////////////////////////////////////////////////////////");
		aux= s.nextLine();
		longitudTibia= Float.parseFloat(aux);
		System.out.println("Ahora introduzca la edad con la que falleció dicha mujer");
		aux= s.nextLine();
		edad= Short.parseShort(aux);
		altura= constante1+constante2*longitudTibia-(constante3*edad);
		System.out.println("  ");
		System.out.println("------------------------------------------");
		System.out.printf("La mujer antes de fallecer medía %.2f cm\n", altura);
		System.out.println("------------------------------------------");
		System.out.println("  ");
		System.out.println("Gracias por utilizar el programa.");

	}

}
