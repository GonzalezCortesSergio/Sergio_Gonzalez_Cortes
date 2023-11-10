package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		
		int caudal= 8; //8 litros por segundo
		int dia= 3600; //24 horas son 3600 segundos
		int aguapozo= 0;
		
		System.out.println("////////////////////////////////////////////////////////////////////////"
				+ "//////////////////////////////////");
		
		System.out.println("	Bienvenido, este programa va a calcular cuántos "
				+ "metros cúbicos han sido extraidos del pozo.");
		System.out.println("////////////////////////////////////////////////////////////////////////"
				+ "//////////////////////////////////");
		System.out.println("\n************************************************************************"
				+ "**********************************");
		System.out.println("Tengamos en cuenta que el caudal del extractor es de "
				+ "8 litros por segundo por lo que: ");
		
		aguapozo= caudal*dia;
		
		System.out.println("\nSe habrán extraído "+ aguapozo + " metros cúbicos de agua en un día.");
		
		System.out.println("************************************************************************"
				+ "**********************************");
		System.out.println("Gracias por utilizar el programa.");
	}

}
