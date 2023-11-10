package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float tres= 3;
		float cinco= 5;
		float media;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("*************************************************"
				+ "************************************************");
		System.out.println("Bienvenido, este programa realizará una media de "
				+ "tres notas y dirá si la media está aprobada o no");
		System.out.println("*************************************************"
				+ "************************************************");
		
		System.out.println("Introduzca la primera nota");
		aux= s.nextLine();
		nota1= Float.parseFloat(aux);
		
		System.out.println("Ahora la segunda");
		aux= s.nextLine();
		nota2= Float.parseFloat(aux);
		
		System.out.println("Finalmente, introduzca la tercera");
		aux= s.nextLine();
		nota3= Float.parseFloat(aux);
		
		media= (nota1+nota2+nota3)/tres;
		
		if (media >= cinco) {
			
			System.out.printf("Su media es de %.2f, usted ha aprobado, enhorabuena\n", media);
		}
		
		else {
			
			System.out.printf("Su media es de %.2f, usted ha suspendido, lo siento\n", media);
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");

	}

}
