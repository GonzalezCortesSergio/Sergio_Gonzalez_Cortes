package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		int personas= 2;
		double precio= 0.82;
		double preciosal= 1.60;
		double preciot;
		double preciop;
		
		
		System.out.println("\t\t\tMETRO SEVILLA\t\t\t");
		System.out.println("-------------------------------------------------------------");
		
		// TODO Auto-generated method stub
		System.out.println("PERSONAS\t\tPrecioPersona\t\tPrecioTotal");
		preciop=precio+preciosal;
		preciot=preciop*personas;
		System.out.printf("%d\t\t\t%.2f\t\t\t%.2f\n",personas,preciop,preciot);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Gracias por usar nuestros servicios");
	}

}
