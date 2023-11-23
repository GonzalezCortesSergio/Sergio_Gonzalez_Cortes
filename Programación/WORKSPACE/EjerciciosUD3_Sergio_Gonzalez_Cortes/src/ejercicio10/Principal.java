package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main (String args[]) {
		
		//Variables
		String nombre;
		int pasajeros;
		int viajes;
		String aux;
		String contraseña;
		String contraseñaCorrecta = "MSevilla!2023";
		int opcion;
		int opcionOperario;
		double precioUnitario = 0.82;
		double dineroAPagar;
		Ticket t = null;
		Maquina m = null;
		
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
				System.out.println();
				System.out.println("""
						------------------------------------------
						Opción 1:	Comprar billete
						Opción 2:	Cambio a devolver
						Opción 3:	Mostrar billete
						Opción 0:	Salir	
						------------------------------------------
						""");
				
				aux = s.nextLine();
				
				opcion = Integer.parseInt(aux);
				
				switch (opcion) {
				
					case 1:
						
						System.out.println("Introduzca su nombre");
						
						nombre = s.nextLine();
						
						System.out.println("Introduzca el número de pasajeros que quiere que "
								+ "contenga su billete");
						
						aux = s.nextLine();
						pasajeros = Integer.parseInt(aux);
						
						System.out.println("Introduzca cuántos viajes quiere que se realicen");
						aux = s.nextLine();
						viajes = Integer.parseInt(aux);
						
						do {
							System.out.println("¿Es usted operario?");
							System.out.println("Opción 1: Sí");
							System.out.println("Opción 0: No");
							
							aux = s.nextLine();
							opcionOperario = Integer.parseInt(aux);
							
							switch (opcionOperario) {
							
								case 1:
									
									System.out.println("Introduzca la contraseña");
									
									contraseña = s.nextLine();
									
									if (contraseña.equals(contraseñaCorrecta)) {
										
										System.out.println("Contraseña correcta; puede cambiar el precio unitario");
										
										System.out.println("Introduzca el nuevo precio");
										
										aux = s.nextLine();
										precioUnitario = Double.parseDouble(aux);
									}
									
									else {
										
										System.out.println("Contraseña equivocada");
									}
									
									break;
							}
						}while (opcionOperario != 1 && opcionOperario != 0);
						t = new Ticket (nombre, pasajeros, viajes, precioUnitario); 
						
						m = new Maquina (t);
						
						break;
						
					case 2:
						
						System.out.println("Introduzca la cantidad que va a pagar");
						aux = s.nextLine();
						dineroAPagar = Double.parseDouble(aux);
						
						if (dineroAPagar > t.getPrecioUnitario()) {
							
							m.dineroADevolver(dineroAPagar);
						}
						
						else {
							
							System.out.println("No es posible que te devuelvan dinero si vas a"
									+ " pagar un valor inferior o igual al del precio del ticket");
						}
						
						break;
						
					case 3:
						
						t.toString();
						
						break;
						
					default: 
						
						System.out.println("Opción equivocada");
						
				}
			}while (opcion != 0);
		
			
		
	}
		
		
		
		
}

