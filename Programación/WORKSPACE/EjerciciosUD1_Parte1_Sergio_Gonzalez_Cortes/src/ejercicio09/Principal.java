package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		
		double navas= 1500;
		double campnou= 65000;
		double teatro= 600;
		double navascamp= 0;
		double navasteat= 0;
		System.out.println("////////////////////////////////////////////////////////"
				+ "///////////////////////////////////////////////////////////");
		System.out.println("	Bienvenido, este programa va a "
				+ "calcular cuántas Navas son necesarias para llenar"
				+ " un establecimiento");
		System.out.println("////////////////////////////////////////////////////////"
				+ "///////////////////////////////////////////////////////////");
		navascamp= campnou/navas;
		
		System.out.printf("Para llenar el Camp Nou son necesarias %.2f Navas\n", navascamp);
		
		System.out.println("********************************************************"
				+ "***********************************************************");
		
		navasteat= teatro/navas;
		System.out.printf("Para llenar el teatro son necesarias %.2f Navas\n", navasteat);
		System.out.println("********************************************************"
				+ "***********************************************************");
		System.out.println("Gracias por utilizar el programa.");

	}

}
