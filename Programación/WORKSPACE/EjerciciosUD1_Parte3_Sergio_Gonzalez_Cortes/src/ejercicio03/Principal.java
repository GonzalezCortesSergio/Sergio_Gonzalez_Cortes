package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String aux;
		String nombre;
		String fecha;
		String ham= ("Hamburguesa Mc Royal");
		String pat= ("Patatas medianas");
		String beb= ("Bebida mediana");
		int cantidadham;
		int cantidadpat;
		int cantidadbeb;
		double precham;
		double prechamf;
		double precpat;
		double precpatf;
		double precbeb;
		double precbebf;
		double entreg;
		double total;
		double cambio;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Introduzca su nombre");
		nombre= s.nextLine();
		System.out.println("Introduzca la fecha");
		fecha= s.nextLine();
		System.out.println("Introduzca la cantidad de hamburguesas y su precio");
		aux= s.nextLine();
		cantidadham= Integer.parseInt(aux);
		aux= s.nextLine();
		precham= Double.parseDouble(aux);
		System.out.println("Introduzca la cantidad de patatas y su precio");
		aux= s.nextLine();
		cantidadpat= Integer.parseInt(aux);
		aux= s.nextLine();
		precpat= Double.parseDouble(aux);
		System.out.println("Introduzca la cantidad de bebidas y su precio");
		aux= s.nextLine();
		cantidadbeb= Integer.parseInt(aux);
		aux= s.nextLine();
		precbeb= Double.parseDouble(aux);
		
		prechamf= precham*cantidadham;
		precpatf= precpat*cantidadpat;
		precbebf= precbeb*cantidadbeb;
		
		System.out.println("Introduzca el dinero entregado");
		aux= s.nextLine();
		entreg= Double.parseDouble(aux);
		
		total= prechamf+precpatf+precbebf;
		
		cambio= entreg-total;
		
		System.out.println("\t\tBienvenido a McDonald's\t\t");
		System.out.println("\t\tAeropuerto Madrid Barajas T4\t\t");
		System.out.println("\t\t\t28042 Madrid\t\t\t");
		System.out.println("  ");
		System.out.printf("\tLe ha atendido %s el %s\n", nombre, fecha);
		System.out.println("   ");
		System.out.printf("\t%d %s\t\t\t%.2f\n",cantidadham, ham, prechamf);
		System.out.printf("\t%d %s\t\t\t%.2f\n",cantidadpat, pat, precpat);
		System.out.printf("\t%d %s\t\t\t%.2f\n",cantidadbeb, beb, precbeb);
		System.out.println("  ");
		
		System.out.printf("\tTOTAL\t\t\t\t\t%.2f\n",total);
		System.out.printf("\tENTREGADO\t\t\t\t%.2f\n",entreg);
		System.out.printf("\tCAMBIO\t\t\t\t\t%.2f\n",cambio);
		
		System.out.println("  ");
		System.out.println("\t\tGRACIAS POR SU VISITA\t\t");
	}

}
