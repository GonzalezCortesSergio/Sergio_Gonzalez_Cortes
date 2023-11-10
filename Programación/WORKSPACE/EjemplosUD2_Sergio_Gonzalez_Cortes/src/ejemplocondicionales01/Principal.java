package ejemplocondicionales01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		short numero1;
		short numero2;
		short tope= 5;
		String aux;
		
		Scanner s= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Diga un número");
		aux= s.nextLine();
		numero1= Short.parseShort(aux);
		
		System.out.println("Ahora otro");
		aux= s.nextLine();
		numero2= Short.parseShort(aux);
		
		if (numero1>= tope){
			System.out.println("Usted ha aprobado");
		}
		else {
			System.out.println("Usted ha suspendido");
		}
	}

}
