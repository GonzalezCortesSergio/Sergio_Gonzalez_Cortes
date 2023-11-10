package ejemplomenucompleto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int eleccion;
		int cero= 0;
		String aux;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Refranero semanal");
		
		do {
			
		
		System.out.println("0.  Para salir");
		System.out.println("1.  Lunes");
		System.out.println("2.  Martes");
		System.out.println("3.  Miércoles");
		System.out.println("4.  Jueves");
		System.out.println("5.  Viernes");
		System.out.println("6.  Sábado");
		System.out.println("7.  Domingo");
		
		aux= s.nextLine();
		eleccion= Integer.parseInt(aux);
		
		switch (eleccion) {
		
		
			case 0:
				
				System.out.println("Hasta luego Lucarrrrr");
				
				
				break;
				
			case 1:
				
				System.out.println("No hay lunes sin su tarea");
				
				break;
				
			case 2:
				
				System.out.println("En martes, ni te cases ni te embarques");
				
				break;
				
			case 3:
				
				System.out.println("El miércoles es el día de la joroba, los días de antes vas de subida y los días después vas de bajada.");
				
				break;
				
			case 4:
				
				System.out.println("Jueves lardero, carne en el puchero.");
				
				break;
				
			case 5:
				
				System.out.println("Achaques el viernes para no ayunar");
				
				break;
				
			case 6:
				
				System.out.println("Quien en sábado descansa, el domingo trabaja.");
				
				break;
				
			case 7:
				
				System.out.println("Cada martes tiene su domingo.");
				
				break;
				
			default:
				
				System.out.println("Opción no válida");
				
				break;
		}
		}while (eleccion != cero);
	}

}
