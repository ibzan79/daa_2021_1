package tarea7_recursividad;

public class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
