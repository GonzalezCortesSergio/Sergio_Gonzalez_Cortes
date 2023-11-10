package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int exponente= 2;
		int peso;
		double altura;
		int imc;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("***************************************************************"
				+ "*************");
		System.out.println("Bienvenido, este programa calculará su IMC y dirá en qué estado"
				+ " se encuentra");
		System.out.println("***************************************************************"
				+ "*************");
		
		System.out.println("Introduzca su peso");
		aux= s.nextLine();
		peso= Integer.parseInt(aux);
		
		System.out.println("Introduzca su altura");
		aux= s.nextLine();
		altura= Double.parseDouble(aux);
		
		imc= (int) (peso/Math.pow(altura, exponente));
		
		switch  (imc) {
		
			case 15:
				System.out.println("Criterio de ingreso en hospital");
				
				break;
				
				
			case 16:
				
				System.out.println("Infrapeso");
				
				break;
				
			case 17:
				
				System.out.println("Bajo peso");
				
				break;
			
			case 18:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 19:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 20:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 21:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 22:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 23:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 24:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
			case 25:
				
				System.out.println("Peso normal (saludable)");
				
				break;
				
				
			case 26:
				
				System.out.println("Soprepeso (obesidad de grado I)");
				
				break;
			
			case 27:
				
				System.out.println("Soprepeso (obesidad de grado I)");
				
				break;
				
			case 28:
				
				System.out.println("Soprepeso (obesidad de grado I)");
				
				break;
				
			case 29:
				
				System.out.println("Soprepeso (obesidad de grado I)");
				
				break;
				
			case 30:
				
				System.out.println("Soprepeso (obesidad de grado I)");
				
				break;
				
			case 31:
				
				System.out.println("Sobrepeso crónico (obesidad de grado II)");
				
				break;
				
			case 32:
				
				System.out.println("Sobrepeso crónico (obesidad de grado II)");
				
				break;
				
			case 33:
				
				System.out.println("Sobrepeso crónico (obesidad de grado II)");
				
				break;
				
			case 34:
				
				System.out.println("Sobrepeso crónico (obesidad de grado II)");
				
				break;
				
			case 35:
				
				System.out.println("Sobrepeso crónico (obesidad de grado II)");
				
				break;
				
			case 36:
				
				System.out.println("Obesidad premórbida (obesidad de grado III)");
				
				break;
				
			case 37:
				
				System.out.println("Obesidad premórbida (obesidad de grado III)");
				
				break;
				
			case 38:
				
				System.out.println("Obesidad premórbida (obesidad de grado III)");
				
				break;
				
			case 39:
				
				System.out.println("Obesidad premórbida (obesidad de grado III)");
				
				break;
				
			case 40:
	
				System.out.println("Obesidad premórbida (obesidad de grado III)");
				
				break;
				
			case 41:
				
				System.out.println("Obesidad mórbida (obesidad de grado IV)");
				
				break;
		
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");

	}

}
