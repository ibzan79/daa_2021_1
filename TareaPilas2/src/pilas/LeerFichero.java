package pilas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	Stack pila1 = new Stack();
	
	public void lee() {
		try {
			FileReader entrada = new FileReader("codigo.txt");
			int c = 0;
			while (c != -1) {
				c = entrada.read();
				if (c != -1) {
					/*char letra = (char) c;
					System.out.println(letra);*/
					int x = c;
					char letra = (char) x;
					if (((int) letra) == 40) {
						pila1.push(letra);
						System.out.println("|-------|");
						pila1.to_string();
						System.out.println("|-------|\n");
					} else if (((int) letra) == 41) {
						if ((((int) letra) != 93) && (((int) letra) != 125)) {
							pila1.pop();
						}
						System.out.println("|-------|");
						pila1.to_string();
						System.out.println("|-------|\n");
					} 
					if (((int) letra) == 91) {
						pila1.push(letra);
						System.out.println("|-------|");
						pila1.to_string();
						System.out.println("|-------|\n");
					} else if (((int) letra) == 93) {
						if ((((int) letra) != 41) && (((int) letra) != 125)) {
							pila1.pop();
						}
						System.out.println("|-------|");
						pila1.to_string();
						System.out.println("|-------|\n");
					} 
					if (((int) letra) == 123) {
						pila1.push(letra);
						System.out.println("|-------|");
						pila1.to_string();
						System.out.println("|-------|\n");
					} else if (((int) letra) == 125) {
						if ((((int) letra) != 93) && (((int) letra) != 41)) {
							pila1.pop();
						}
						System.out.println("|-------|");
						pila1.to_string();
						System.out.println("|-------|\n");
					}
				}
			}
			if (pila1.is_empty()) {
				System.out.println("Longitud de la pila: " + pila1.get_lenght());
				System.out.println("El código está balanceado");
			} else {
				System.out.println("El código no está balanceado");
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
