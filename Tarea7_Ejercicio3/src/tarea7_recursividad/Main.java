package tarea7_recursividad;

public class Main {

	// Ejercicio 3: Sacar de un ADT pila el valor en la posición media.
	
	public static void main(String[] args) {
		Stack pila = new Stack();
		
		/*
		 * For para meter los datos a la pila inicial
		 */
		for (int i = 0; i < 7; i++) {
			pila.push(i + 1);
		}
		
		System.out.println("Pila original:");
		pila.to_string();
		System.out.println("------------------\n");
		
		Stack pila2 = new Stack();
		
		eliminarMitadRec(pila, pila2, pila.get_lenght(), (pila.get_lenght() / 2) + 1);
		
		System.out.println("Pila modificada:");
		pila.to_string();
	}
	
	public static void eliminarMitadRec(Stack pila, Stack pila2, int indice, int mitad) {
		if (indice == mitad) {
			pila.pop();
		} else {
			indice--;
			pila2.push(pila.get_top());
			pila.pop();
			eliminarMitadRec(pila, pila2, indice, mitad);
			pila.push(pila2.get_top());
			pila2.pop();
		}
	}

}
