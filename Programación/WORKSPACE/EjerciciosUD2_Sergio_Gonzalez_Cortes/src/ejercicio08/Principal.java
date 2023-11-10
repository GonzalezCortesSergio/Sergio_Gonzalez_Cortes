package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String usuarioguardado;
		String contraseñaguardada;
		String usuario;
		String contraseña;
		
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Nombre de Usuario");
		usuarioguardado= s.nextLine();
		
		System.out.println("Contraseña");
		contraseñaguardada= s.nextLine();
		
		System.out.println("********************************************************");
		System.out.println("Bienvenido, introduzca su nombre de usuario y contraseña");
		System.out.println("********************************************************");
		usuario= s.nextLine();
		contraseña= s.nextLine();
		
		if (usuarioguardado.equals(usuario) && contraseñaguardada.equals(contraseña)) {
			
			System.out.printf("Bienvenido %s, puede acceder al programa", usuario);
		}
		
		else {
			
			System.out.println("El nombre de usuario o contraseña son incorrectos");
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
