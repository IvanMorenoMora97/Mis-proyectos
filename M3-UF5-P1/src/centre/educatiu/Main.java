package centre.educatiu;

public class Main {

	public static void main(String[] args) {

		// COMPROVACI� DE LA CLASE PERSONA
		Persona persona1 = new Persona("Iv�n", "Espa�ita");
		Persona persona2 = new Persona();

		persona2.setNom("E.T");
		persona2.setAdre�a("Marte");
		System.out.println("---------------------------------------------------");
		persona1.Visualitzar();
		System.out.println("---------------------------------------------------");
		persona2.Visualitzar();
		
		System.out.println();
		System.out.println();
		
		// COMPROVACI� DE LA CLASE ESTUDIANT

		Estudiant estudiante1 = new Estudiant();

		estudiante1.setDataAlta("10/09/1890");
		estudiante1.setEdat(12);
		estudiante1.setNif("12345D");

		estudiante1.Visualitzar();
		
		Estudiant estudiante2 = new Estudiant("N�vi", "Ati�apse", "11/11/1111" , 21, "34596A");
		
		estudiante2.Visualitzar();
	
		Estudiant estudiante3 = new Estudiant(persona1, "22/22/2222", 89, "9999S");
		System.out.println("---------------------------------------------------");
		estudiante3.Visualitzar();
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println();
		
		//COMPROVACI� DE LA CLASE TREBALLADOR
		
		Treballador treballador1 = new Treballador();
		
		treballador1.setNumSS("POPO1234 0 123");
		treballador1.setAdre�a("calle falsa");
		
		treballador1.obtenirAdre�es();
		treballador1.Visualitzar();
		
		Treballador treballador2 = new Treballador("Juanito", "Roma", "PIPO 0 1234","calle falsa");
		
		treballador2.obtenirAdre�es();
		treballador2.Visualitzar();
		
		Treballador treballador3 = new Treballador(treballador1);
		
		treballador3.obtenirAdre�es();
		treballador3.Visualitzar();
		
		System.out.println();
		System.out.println();
		
		//COMPROVACI� DE LA CLASE INTERCANVI
		
		Intercanvi intercanvi1 = new Intercanvi();
		
		intercanvi1.setPaisOrigen("Rusia");
		
		intercanvi1.Visualitzar();
		
		Intercanvi intercanvi2 = new Intercanvi(estudiante3, "Rumania"); /*ARREGLAR NO SALE EL NOMBRE NI LA ADRE�A*/
		System.out.println("---------------------------------------------------");
		intercanvi2.Visualitzar();
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println();
		
		//COMPROVACI� DE LA CLASE PROFESSOR
		
		Professor professor1 = new Professor();
		
		professor1.setTitulaci�("Lengua");
		professor1.setEspecialitat("Ingl�s");
		
		professor1.Visualitzar();
		
		Professor professor2 = new Professor(treballador2, "Biologia", "Insectos"); /*ARREGLAR NO SALE EL NOMBRE*/
		
		professor2.Visualitzar();
		
		System.out.println();
		System.out.println();
		
		//COMPROVACI� DE LA CLASE PERSONALGESTIO
		
		PersonalGesti� personal1 = new PersonalGesti�();
		
		personal1.setPosici�("Supervisor");
		
		personal1.Visualitzar();
		
		PersonalGesti� personal2 = new PersonalGesti�(treballador2, "Encargado"); /*ARREGLAR NO SALE EL NOMBRE*/
		
		personal2.Visualitzar();
		
		PersonalGesti� personal3 = new PersonalGesti�(personal2);
		
		personal3.Visualitzar();
		
		
		
	}

	

}
