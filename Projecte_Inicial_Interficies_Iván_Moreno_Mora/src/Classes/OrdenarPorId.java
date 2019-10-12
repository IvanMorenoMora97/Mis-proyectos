package Classes;

import java.util.Comparator;

public class OrdenarPorId implements Comparator<Malalties>{

	//COMPARATOR QUE ORDENA LA LISTA POR ID
	
	@Override
	public int compare(Malalties m1, Malalties m2) {
		
		return m1.getId() - m2.getId();
	}

}
