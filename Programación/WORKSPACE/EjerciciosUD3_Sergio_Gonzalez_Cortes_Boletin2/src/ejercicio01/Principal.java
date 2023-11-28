package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Variables
		
		String aux, codigoProducto, nombreProducto;
		double porCosTransporte, precioFabrica;
		int tam = 100, opcion, opcionFragil;
		
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciar Array y Tienda
		
		Producto [] lista = new Producto [tam];
		
		Tienda t = new Tienda (lista , 0);
		
		System.out.println("/".repeat(95));
		System.out.println();
		System.out.println("####### ### ####### #     # ######     #       #     #    #    #     # ####### #       ####### \r\n"
				+ "   #     #  #       ##    # #     #   # #      ##   ##   # #   ##    # #     # #       #     # \r\n"
				+ "   #     #  #       # #   # #     #  #   #     # # # #  #   #  # #   # #     # #       #     # \r\n"
				+ "   #     #  #####   #  #  # #     # #     #    #  #  # #     # #  #  # #     # #       #     # \r\n"
				+ "   #     #  #       #   # # #     # #######    #     # ####### #   # # #     # #       #     # \r\n"
				+ "   #     #  #       #    ## #     # #     #    #     # #     # #    ## #     # #       #     # \r\n"
				+ "   #    ### ####### #     # ######  #     #    #     # #     # #     # ####### ####### ####### ");
		System.out.println();
		System.out.println("/".repeat(95));
		
		do {
			System.out.println();
			
			System.out.println("""
					Opción 1:	Agregar un producto
					Opción 2:	Mostrar productos
					Opción 3:	Obtener PVP
					Opción 0:	Salir
				
					""");
			
			aux = s.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					System.out.println("Inserte el nombre del producto");
					nombreProducto = s.nextLine();
					System.out.println("Inserte el código del producto");
					codigoProducto = s.nextLine();
					System.out.println("Inserte su precio de fábrica");
					aux = s.nextLine();
					precioFabrica = Double.parseDouble(aux);
					System.out.println("Inserte el porcentaje de coste en el transporte");
					aux = s.nextLine();
					porCosTransporte = Double.parseDouble(aux);
					
					do {
						System.out.println("¿Su producto es frágil?");
						System.out.println("""
								Opción 1:	Sí
								Opción 2:	No
								""");
						aux = s.nextLine();
						opcionFragil = Integer.parseInt(aux);
					
					}while (opcionFragil != 1 && opcionFragil != 2);
					
					t.agregarProducto(new Producto (precioFabrica, porCosTransporte, nombreProducto, 
							codigoProducto, t.comprobarFragil(opcionFragil) ));
					
					break;
					
				case 2:
					
					for (int i = 0; i < t.getNumProductos(); i++) {
						
						System.out.println(lista[i].toString());
					}
					
					break;
					
			}
		
		}while (opcion != 0);
	}

}
