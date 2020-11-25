package fuerza_bruta;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Lector lector1 = new Lector();
		lector1.lee();
		System.out.println(lector1.nuevoString + "\n");
		String[] separado = lector1.nuevoString.split(" ");
		
		
		int contador = 0;
		for (int i = 0; i < separado.length; i++) {
			for (int j = 0; j < separado.length; j++) {
				//System.out.println(i + "," + j);
				if ((separado[i].equals(separado[j]))) {
					//System.out.println(i + "," + j);
					//System.out.println("Si " + separado[i] + " == " + separado[j]);
					contador++;
				}
			}
			System.out.println("Palabras de '" + separado[i] + "': " + contador);
			contador = 0;
		}
	}
	
}
