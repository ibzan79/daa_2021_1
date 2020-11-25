package fuerza_bruta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
	CrearArchivo archivo = new CrearArchivo();
	String nuevoString = "";
	
	public void lee() {
		archivo.crearArchivo();
		try {
			FileReader entrada = new FileReader(archivo.escribir());
			int c = 0;
			while (c != -1) {
				c = entrada.read();
				if (c != -1) {
					char letra = (char) c;
					
					// Para eliminar los acentos
					if (letra == '�') {
						letra = 'a';
					}
					if (letra == '�') {
						letra = 'e';
					}
					if (letra == '�') {
						letra = 'i';
					}
					if (letra == '�') {
						letra = 'o';
					}
					if (letra == '�') {
						letra = 'u';
					}
					
					
					nuevoString += letra;
				} 
				
			}
			//System.out.println("\n");
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	
	public String toString() {
		
		return nuevoString;
	}
}
