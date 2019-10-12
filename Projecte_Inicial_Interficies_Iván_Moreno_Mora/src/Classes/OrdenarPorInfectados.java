package Classes;

import java.util.Comparator;

public class OrdenarPorInfectados implements Comparator<Malalties>{
	
	//COMPARATOR QUE ORDENA LA LISTA POR GENTE INFECTADA
	
	@Override
	public int compare(Malalties m1, Malalties m2) {
		
		return m1.getInfecció() - m2.getInfecció();
	}

}
