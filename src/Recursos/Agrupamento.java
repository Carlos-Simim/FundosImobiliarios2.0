package Recursos;

import java.util.ArrayList;
import java.util.List;

public class Agrupamento<E> {
	private List<E> lista = new ArrayList();
	
	public void add(E elemento) {
		lista.add(elemento);
	}
	
	public void remove(E elemento) {
		lista.remove(elemento);
	}
}
