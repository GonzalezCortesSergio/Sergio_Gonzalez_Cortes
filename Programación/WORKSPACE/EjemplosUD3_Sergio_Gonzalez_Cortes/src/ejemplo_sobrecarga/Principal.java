package ejemplo_sobrecarga;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones o = new Operaciones();
		System.out.println(o.sumar(32.5, 3.4));
		System.out.println(o.sumar(22, 12));
		System.out.println(o.sumar(22, 22.4));
	}

}
