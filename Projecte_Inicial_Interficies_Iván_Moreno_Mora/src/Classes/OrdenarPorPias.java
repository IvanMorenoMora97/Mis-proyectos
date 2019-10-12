package Classes;

import java.util.Comparator;

public class OrdenarPorPias implements Comparator<Malalties>{

	//COMPARATOR QUE ORDENA LA LISTA POR PAIS
	
	@Override
	public int compare(Malalties m1, Malalties m2) {
		
		return m1.getPaisos().compareTo(m2.getPaisos())  ;
	}

}
