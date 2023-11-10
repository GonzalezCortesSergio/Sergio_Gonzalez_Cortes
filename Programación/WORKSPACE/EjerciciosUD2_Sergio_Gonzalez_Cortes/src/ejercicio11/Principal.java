package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float peso;
		int planeta;
		String aux;
		float pesoplaneta;
		float equivmerc= 0.38f;
		float equivven= 0.91f;
		float equivtier=1.00f;
		float equivmart=0.38f;
		float equivjupit=2.53f;
		float equivsatur=1.06f;
		float equivuran=0.92f;
		float equivneptun=1.2f;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("***************************************"
				+ "***************************************************");
		System.out.println("Bienvenido, este programa dirá el peso "
				+ "que tendrá en uno de los planetas del Sistema Solar");
		System.out.println("***************************************"
				+ "***************************************************");
		
		System.out.println("Introduzca su peso en kilos");
		aux= s.nextLine();
		peso= Float.parseFloat(aux);
		
		System.out.println("Seleccione el planeta del Sistema Solar:");
		System.out.println("  ");
		System.out.println("--------------------------");
		System.out.println("Mercurio		1");
		System.out.println("Venus			2");
		System.out.println("Tierra			3");
		System.out.println("Marte			4");
		System.out.println("Júpiter			5");
		System.out.println("Saturno			6");
		System.out.println("Urano			7");
		System.out.println("Neptuno			8");
		System.out.println("--------------------------");
		aux= s.nextLine();
		planeta= Integer.parseInt(aux);
		
		switch (planeta){
		
			case 1:
				pesoplaneta= peso*equivmerc;
				System.out.printf("Su peso en Mercurio será de %.2f kg\n", pesoplaneta);
				
				break;
				
			case 2:
				pesoplaneta= peso*equivven;
				
				System.out.printf("Su peso en Venus será de %.2f kg\n", pesoplaneta);
				
				break;
			
			case 3:
				pesoplaneta= peso*equivtier;
				
				System.out.printf("Su peso en La Tierra será de %.2f kg\n", pesoplaneta);
				
				break;
				
			case 4:
				pesoplaneta= peso*equivmart;
				
				System.out.printf("Su peso en Marte será de %.2f kg\n", pesoplaneta);
				
				break;
				
			case 5:
				pesoplaneta= peso*equivjupit;
				
				System.out.printf("Su peso en Júpiter será de %.2f kg\n", pesoplaneta);
				
				break;
				
			case 6:
				pesoplaneta= peso*equivsatur;
				
				System.out.printf("Su peso en Saturno será de %.2f kg\n", pesoplaneta);
				
				break;
				
			case 7:
				pesoplaneta= peso*equivuran;
				
				System.out.printf("Su peso en Urano será de %.2f kg\n", pesoplaneta);
				
				break;
				
			case 8:
				pesoplaneta= peso*equivneptun;
				
				System.out.printf("Su peso en Neptuno será de %.2f kg\n", pesoplaneta);
				
				break;
				
			default:
				
				System.out.println("Opción no válida");
				
				break;
		
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
