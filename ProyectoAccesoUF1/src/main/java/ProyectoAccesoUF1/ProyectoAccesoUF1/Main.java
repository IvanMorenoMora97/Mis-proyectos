package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.util.Scanner;

public class Main {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		do {
			
			System.out.println("SEL·LECCIONA UNA OPCIÓ");
			System.out.println("1. Leer fichero de texto.");
			System.out.println("2. Leer fichero XML.");
			System.out.println("3. Leer fichero JSON.");
			System.out.println("4. Afegir professor.");
			System.out.println("5. Jubilar professor.");
			System.out.println("6. Comprar màquina.");
			System.out.println("7. Habilitar aire acondicionat.");
			System.out.println("8. Canviar màquina.");
			System.out.println("9. Afegir Alumne.");
			System.out.println("10. Eliminar Alumne.");
			System.out.println("11. Afegir Telefon.");
			System.out.println("12. Crear una classe.");
			System.out.println("13. Llegir la classe.");
			System.out.println("14. Sortir del menú.");
			opcion = reader.nextInt();

			switch (opcion) {

			case 1:
				// LEER FICHERO DE TEXTO
				System.out.println();
				System.out.println("FICHERO DE TEXTO");
				leerFicheroTexto.LeerTexto("professors.txt");
				System.out.println();

				break;

			case 2:

				// LEER FICHERO XML
				System.out.println();
				System.out.println("FICHERO XML");
				leerFicheroXML.LeerXML("alumnes.xml"); //ARREGLAR

				break;

			case 3:

				// LEER FICHERO JSON
				System.out.println();
				System.out.println("FICHERO JSON");
				leerFicheroJSON.LeerJSON("aules.json");
				System.out.println();

				break;

			case 4:
				// AÑADIR PROFESOR
				afegirProfessor.Afegir("professors.txt");
				break;

			case 5:
				// JUBILAR PROFESSOR
				jubilarProfessor.Jubilar("professors.txt");
				break;

			case 6:
				// COMPRAR MAQUINA
				comprarMaquina.comprarMaquina(); 
				break;

			case 7:
				// HABILITAR AIRE ACONDICIONAT 
				switchAC.habilitarAire("aules.json");	
				break;
				
			case 8: 
				//CANVIAR MAQUINA DE AULA
				canviaMaquina.canviar();
				break;
			
			case 9:
				//AFEGIR ALUMNE
				afegirAlumne.Añadir();
				break;
				
			case 10:
				//ELIMINAR UN ALUMNE
				alCarrer.Eliminar();
				break;
				
			case 11:
				//AFEGIR TELEFON
				afegirTelefon.Afegir();
				break;
				
			case 12:
				//CREAR CLASSE
				System.out.println();
				crearClasse.crear();
				System.out.println();
				break;
				
			case 13:
				//VISUALITZAR CLASSE
				System.out.println();
				leerDAT.leer("classes.dat");
				System.out.println();
				break;
			}

		} while (opcion != 14);
		System.out.println("Heu sortit del menú.");

		reader.close();

	}

}
