package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		
		byte euro= 50;
		float libraeuro= 1.15f;
		float resultado=0f;
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("	Bienvenido, vamos a realizar"
				+ " un cambio de euros a libras esterlinas.");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("  ");
		resultado= euro/libraeuro;
		System.out.println("En esta ocasión cambiaremos 50 euros a libras");
		System.out.printf("50 euros a libras esterlinas son: %.2f libras.\n", resultado );
		System.out.println("************************************************************************************");
		System.out.println("Gracias por utilizar el programa");
		// TODO Auto-generated method stub

	}

}
