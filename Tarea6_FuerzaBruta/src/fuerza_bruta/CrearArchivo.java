package fuerza_bruta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
	File archivo;
	
	public void crearArchivo() {
		archivo = new File("lema.txt");
		/*try {
			if (archivo.createNewFile()) {
				System.out.println("Se ha creado correctamente");
			}
		} catch (IOException e) {
			System.out.println("No se ha creado el archivo " + e);
		}*/
	}
	
	public File escribir() {
		try {
			String lema = "El lema que anima a la Universidad Nacional, Por mi raza hablar� el esp�ritu, revela la vocaci�n human�stica con la que fue concebida. El autor de esta c�lebre frase, Jos� Vasconcelos, asumi� la rector�a en 1920, en una �poca en que las esperanzas de la Revoluci�n a�n estaban vivas,\r\n" + 
					" hab�a una gran fe en la Patria y el �nimo redentor se extend�a en el ambiente.";
			lema = lema.toLowerCase();
			lema = lema.replace('.', ' ');
			lema = lema.replace(',', ' ');
			FileWriter escribir = new FileWriter(archivo);
			escribir.write(lema);
			escribir.close();
		} catch (IOException e) {
			System.out.println("Error, no se pudo escribir");
		}
		return archivo;
	}
}
