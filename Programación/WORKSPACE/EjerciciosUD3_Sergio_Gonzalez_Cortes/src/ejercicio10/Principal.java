package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main (String args[]) {
		
		//Variables
		String codigo;
		int pasajeros;
		int viajes;
		String fecha;
		String aux;
		String contraseña;
		String contraseñaCorrecta = "MSevilla!2023";
		int opcion;
		int opcionOperario;
		
		//Inicializar Scanner 
		Scanner s = new Scanner(System.in);
		
		//Bienvenida
		
		System.out.print("   ");
		System.out.println("/".repeat(90));
		
		System.out.println("\t#     #                                #####                                       \r\n"
				+ "\t##   ## ###### ##### #####   ####     #     # ###### #    # # #      #        ##   \r\n"
				+ "\t# # # # #        #   #    # #    #    #       #      #    # # #      #       #  #  \r\n"
				+ "\t#  #  # #####    #   #    # #    #     #####  #####  #    # # #      #      #    # \r\n"
				+ "\t#     # #        #   #####  #    #          # #      #    # # #      #      ###### \r\n"
				+ "\t#     # #        #   #   #  #    #    #     # #       #  #  # #      #      #    # \r\n"
				+ "\t#     # ######   #   #    #  ####      #####  ######   ##   # ###### ###### #    # \r\n"
				+ "");
		System.out.print("   ");
		System.out.println("/".repeat(90));
		
		do {
			System.out.println("¿Es usted operario?");
			System.out.println("""
					Opción 1:	Sí
					Opción 0:	No
					""");
			aux = s.nextLine();
			opcionOperario = Integer.parseInt(aux);
			
			if (opcionOperario != 0 || opcionOperario != 1) {
				
				System.out.println("Opción equivocada");
			}
			
			
		}while (opcionOperario != 0 || opcionOperario != 1);
		
		if (opcionOperario == 0) {
			
			do {
				System.out.println("""
						Opción 1:	Comprar billete
						Opción 2:	Cambio a devolver
						Opción 3:	Mostrar billete
						Opción 0:	Salir	
						""");
			
			}while (opcion != 0);
		
		}
		
		else {
			
			do {
				System.out.println("Introduzca la contraseña de operario");
			
				contraseña = s.nextLine();
			
				if (contraseña.equals(contraseñaCorrecta)) {
				
					System.out.println("Contraseña correcta, puede acceder");
				}
			
				else {
				
					System.out.println("Contraseña incorrecta. Vuelva a intentarlo");
				}
			}while (contraseña.equals(contraseñaCorrecta));
		}
		
		
	}
}
