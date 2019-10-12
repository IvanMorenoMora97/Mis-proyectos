package Classes;

import java.util.Comparator;

public class OrdenarPorMuertos implements Comparator<Malalties>{

	//COMPARATOR QUE ME ORDENA LA LISTA POR GENTE QUE HA MUERTO
	
	@Override
	public int compare(Malalties m1, Malalties m2) {
		
		return m1.getMorts() - m2.getMorts();
	}

}
