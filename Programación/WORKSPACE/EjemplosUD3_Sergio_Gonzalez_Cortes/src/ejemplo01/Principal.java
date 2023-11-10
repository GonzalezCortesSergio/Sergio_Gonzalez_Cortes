package ejemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad;
		double notaMedia;
		String aux;
		Scanner s= new Scanner(System.in);
		Alumno a1;
		Alumno a2;
		String calle;
		//Instanciamos un objeto con valores
		
		System.out.println("Diga el nombre");
		nombre= s.nextLine();
		System.out.println("Diga edad");
		aux= s.nextLine();
		edad= Integer.parseInt(aux);
		System.out.println("Diga nota media");
		aux= s.nextLine();
		notaMedia= Double.parseDouble(aux);
		
		System.out.println("Diga calle");
		calle= s.nextLine();
		
		
		
		
		a1 = new Alumno(nombre, edad, notaMedia);
		
		
		a1.mostrarDatos(calle);
	}

}
