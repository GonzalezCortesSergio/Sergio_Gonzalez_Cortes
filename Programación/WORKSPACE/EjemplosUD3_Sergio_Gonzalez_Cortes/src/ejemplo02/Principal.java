package ejemplo02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		
		String nombre;
		String aux;
		double notaProg;
		double notaBD;
		double media;
		Alumno a1;
		
		
		//Scanner
		Scanner s= new Scanner(System.in);
		
		//Pedir datos
		
		System.out.println("Introduzca nombre");
		nombre= s.nextLine();
		System.out.println("Introduzca nota programación");
		aux= s.nextLine();
		notaProg= Double.parseDouble(aux);
		System.out.println("Introduzca nota Base de Datos");
		aux= s.nextLine();
		notaBD= Double.parseDouble(aux);
		
		//Instanciar alumno
		a1= new Alumno (nombre, notaProg, notaBD);
		
		
		//Acciones aplicadas
		
		media= a1.calcularNotamedia();
		
		a1.mostrarNotamedia(media);
		
	}

}
