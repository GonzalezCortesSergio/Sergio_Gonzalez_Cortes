package ejemplo_operaciones;

public class Principal {

	public static void main(String[] args) {
		int edad= 18;
		int num= 2;
		int resultado=0;
		double num2= 1.33;
		double num3= 1.62;
		double resultado2= 0;
		
		System.out.println("Bienvenido, vamos a multiplicar dos números");
		//Aquí irá la lectura por teclado
		
		resultado= (edad*num);
		
		System.out.println("El resultado de la multiplicación es: "+resultado);
		
		
		
		System.out.println("Vamos a realizar otra operación, por defecto pondremos una suma");
		
		resultado= (edad+num);
		
		System.out.println("El resultado de la suma es: "+resultado);
		
		//Ahora con double
		
		System.out.println("Vamos a multiplicar números con comas");
		
		System.out.println("Tomaremos como ejemplo 1,23 y 1,46");
		
		resultado2= (num2*num3);
		System.out.printf("El resultado es: "+resultado2);
		
		
		
	
		
		
	}

}
