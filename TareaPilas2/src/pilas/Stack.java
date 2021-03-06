package pilas;

public class Stack {
	private Nodo tope;
	private int longitud;
	private String lista = "";
	
	public Stack() {
		this.tope = null;
		this.longitud = 0;
	}
	
	public boolean is_empty() {
		if(tope == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(char dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.setSiguiente(tope);
		tope = nuevo;
		longitud++;
	}
	
	public char pop() {
		char aux = tope.getDato();
		tope = tope.getSiguiente();
		longitud--;
		return aux;
	}
	
	public char get_top() {
		return tope.getDato();
	}
	
	public int get_lenght() {
		return longitud;
	}
	
	public void to_string() {
		 Nodo recorrer = tope;
		 while (recorrer != null) {
			 lista += recorrer.getDato() + "\n";
			 recorrer = recorrer.getSiguiente(); 
		 }
		 System.out.println(lista);
		 lista = "";
	}
}
