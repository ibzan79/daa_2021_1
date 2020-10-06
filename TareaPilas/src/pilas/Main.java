package pilas;

public class Main {

	public static void main(String[] args) {
		LeerFichero lector = new LeerFichero();
		System.out.println("ARCHIVO 1");
		lector.lee();
		System.out.println("------------------------\nARCHIVO 2");
		lector.lee2();
		System.out.println("------------------------\nARCHIVO 3");
		lector.lee3();
	}

}
