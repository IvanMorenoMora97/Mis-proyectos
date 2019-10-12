package Classes;

import java.util.ArrayList;
import java.util.Iterator;

//CLASE PARA LOS GENERICOS Y IMPLEMENTAR ITERABLE

public class Hospital<T> implements Iterable<T> {

	private ArrayList<T> lista = new ArrayList<T>();
	
	//METODO ADD MODIFICADO PARA ALMACENAR CUALQUIER OBJETO
	public void add (T objeto) {
		
		lista.add(objeto);
		
	}
	
	//METODO QUE MOSTRARA EL CONTENIDO QUE GUARDA EL ARRAYLIST
	public Iterator<T> iterator() {
		
		return lista.iterator();
		
	}
	

}



	
