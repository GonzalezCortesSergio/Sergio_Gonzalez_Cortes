package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		float km= 100;
		float preciogas= 1.760f;
		float litros= 7.5f;
		float costelitros= 0;
		// TODO Auto-generated method stub
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("	Bienvenido, vamos a calcular el"
				+ " dinero gastado en gasolina durante un viaje");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
		costelitros= preciogas*litros;
		System.out.printf("El coste del litro de gasolina es de %.2f euros\n",preciogas);
		System.out.printf("Tomando en cuenta que un viaje de %.0f kilómetros gasta %.2f litros de gasolina; "
				+ "el viaje costará %.2f euros.\n",km , litros, costelitros );
		System.out.println("********************************************************************************************"
				+ "*****************");
		System.out.println("Gracias por utilizar el programa.");
		
		
	}

}
