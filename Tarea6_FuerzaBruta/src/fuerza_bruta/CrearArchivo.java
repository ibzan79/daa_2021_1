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
			String lema = "El lema que anima a la Universidad Nacional, Por mi raza hablará el espíritu, revela la vocación humanística con la que fue concebida. El autor de esta célebre frase, José Vasconcelos, asumió la rectoría en 1920, en una época en que las esperanzas de la Revolución aún estaban vivas,\r\n" + 
					" había una gran fe en la Patria y el ánimo redentor se extendía en el ambiente.";
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
