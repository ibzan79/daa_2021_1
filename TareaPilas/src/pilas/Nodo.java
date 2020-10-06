package pilas;

public class Nodo {
	private char dato;
	private Nodo siguiente;
	
	public Nodo(char dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}

	public char getDato() {
		return dato;
	}

	public void setDato(char dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
