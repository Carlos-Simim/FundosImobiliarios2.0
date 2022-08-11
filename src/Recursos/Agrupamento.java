package Recursos;

import java.util.ArrayList;
import java.util.List;

public class Agrupamento<T> {
	private List<T> lista = new ArrayList<T>();

	public void add(T elemento) {
		lista.add(elemento);
	}
	
	public void remove(T elemento) {
		lista.remove(elemento);
	}

	@SuppressWarnings("unused")
	public int size() {
		int soma = 0;
		
		for(var v : lista) {
			soma++;
		}
		
		return soma;
	}

	public T get(int i) {
		return lista.get(i);
	}
	
}
