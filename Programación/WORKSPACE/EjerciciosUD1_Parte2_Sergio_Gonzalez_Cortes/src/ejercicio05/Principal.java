package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo;
		String nombre;
		String aux;
		double interes1= 1;
		double saldoint1;
		double saldoint2;
		double interes2= 3;
		double saldofin;
		
		Scanner s= new Scanner (System.in);
		System.out.println("Introduzca su nombre");
		nombre= s.nextLine();
		
		System.out.printf("Bienvenido %s, porfavor, introduzca su saldo inicial\n",nombre);
		aux= s.nextLine();
		saldo= Double.parseDouble(aux);
		
		System.out.println("Tomemos en cuenta los intereses que tiene en su saldo:");
		saldoint1= saldo*interes1/100;
		saldoint2= saldo*interes2/100;
		saldofin= saldo-saldoint1-saldoint2;
		System.out.println("--------------------------------------------------------------");
		
		System.out.printf("Por lo que su saldo final es de %.2f euros\n",saldofin);
		System.out.println("**************************************************************");
		System.out.println("Gracias por utilizar el programa");
		
	}

}
