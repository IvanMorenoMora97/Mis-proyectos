package centre.educatiu;

public class Main {

	public static void main(String[] args) {

		// COMPROVACIÓ DE LA CLASE PERSONA
		Persona persona1 = new Persona("Iván", "Españita");
		Persona persona2 = new Persona();

		persona2.setNom("E.T");
		persona2.setAdreça("Marte");
		System.out.println("---------------------------------------------------");
		persona1.Visualitzar();
		System.out.println("---------------------------------------------------");
		persona2.Visualitzar();
		
		System.out.println();
		System.out.println();
		
		// COMPROVACIÓ DE LA CLASE ESTUDIANT

		Estudiant estudiante1 = new Estudiant();

		estudiante1.setDataAlta("10/09/1890");
		estudiante1.setEdat(12);
		estudiante1.setNif("12345D");

		estudiante1.Visualitzar();
		
		Estudiant estudiante2 = new Estudiant("Návi", "Atiñapse", "11/11/1111" , 21, "34596A");
		
		estudiante2.Visualitzar();
	
		Estudiant estudiante3 = new Estudiant(persona1, "22/22/2222", 89, "9999S");
		System.out.println("---------------------------------------------------");
		estudiante3.Visualitzar();
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println();
		
		//COMPROVACIÓ DE LA CLASE TREBALLADOR
		
		Treballador treballador1 = new Treballador();
		
		treballador1.setNumSS("POPO1234 0 123");
		treballador1.setAdreça("calle falsa");
		
		treballador1.obtenirAdreçes();
		treballador1.Visualitzar();
		
		Treballador treballador2 = new Treballador("Juanito", "Roma", "PIPO 0 1234","calle falsa");
		
		treballador2.obtenirAdreçes();
		treballador2.Visualitzar();
		
		Treballador treballador3 = new Treballador(treballador1);
		
		treballador3.obtenirAdreçes();
		treballador3.Visualitzar();
		
		System.out.println();
		System.out.println();
		
		//COMPROVACIÓ DE LA CLASE INTERCANVI
		
		Intercanvi intercanvi1 = new Intercanvi();
		
		intercanvi1.setPaisOrigen("Rusia");
		
		intercanvi1.Visualitzar();
		
		Intercanvi intercanvi2 = new Intercanvi(estudiante3, "Rumania"); /*ARREGLAR NO SALE EL NOMBRE NI LA ADREÇA*/
		System.out.println("---------------------------------------------------");
		intercanvi2.Visualitzar();
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println();
		
		//COMPROVACIÓ DE LA CLASE PROFESSOR
		
		Professor professor1 = new Professor();
		
		professor1.setTitulació("Lengua");
		professor1.setEspecialitat("Inglés");
		
		professor1.Visualitzar();
		
		Professor professor2 = new Professor(treballador2, "Biologia", "Insectos"); /*ARREGLAR NO SALE EL NOMBRE*/
		
		professor2.Visualitzar();
		
		System.out.println();
		System.out.println();
		
		//COMPROVACIÓ DE LA CLASE PERSONALGESTIO
		
		PersonalGestió personal1 = new PersonalGestió();
		
		personal1.setPosició("Supervisor");
		
		personal1.Visualitzar();
		
		PersonalGestió personal2 = new PersonalGestió(treballador2, "Encargado"); /*ARREGLAR NO SALE EL NOMBRE*/
		
		personal2.Visualitzar();
		
		PersonalGestió personal3 = new PersonalGestió(personal2);
		
		personal3.Visualitzar();
		
		
		
	}

	

}
