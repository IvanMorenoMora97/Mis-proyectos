package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.util.Scanner;

public class Main {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		do {

			System.out.println("1. Leer fichero de texto.");
			System.out.println("2. Leer fichero XML.");
			System.out.println("3. Leer fichero JSON.");
			System.out.println("4. Afegir professor.");
			System.out.println("5. Jubilar professor.");
			System.out.println("6. Comprar màquina.");
			System.out.println("7. Habilitar aire acondicionat.");
			System.out.println("8. Canviar màquina.");
			opcion = reader.nextInt();

			switch (opcion) {

			case 1:
				// LEER FICHERO DE TEXTO
				System.out.println();
				System.out.println("FICHERO DE TEXTO");
				LeerFicheroTexto.LeerTexto("professors.txt");
				System.out.println();

				break;

			case 2:

				// LEER FICHERO XML
				System.out.println();
				System.out.println("FICHERO XML");
				// LeerFicheroXML.LeerXML("alumnes.xml"); //ARREGLAR

				break;

			case 3:

				// LEER FICHERO JSON
				System.out.println();
				System.out.println("FICHERO JSON");
				LeerFicheroJSON.LeerJSON("aules.json");
				System.out.println();

				break;

			case 4:
				// AÑADIR PROFESOR
				AfegirProfessor.Afegir("professors.txt");
				break;

			case 5:
				// JUBILAR PROFESSOR
				JubilarProfessor.Jubilar("professors.txt");
				break;

			case 6:
				// COMPRAR MAQUINA
				ComprarMaquina.comprarMaquina(); // ARREGLAR INTRODUCE EL OBJETO PER MAL
				break;

			case 7:
				// HABILITAR AIRE ACONDICIONAT 
				switchAC.habilitarAire("aules.json");	//HABILITAR Y DESHABILITAR ARREGLADO FALTA REESCRIBIRLO
				break;
				
			case 8: 
				//CANVIAR MAQUINA DE AULA
				canviaMaquina.canviar();
				break;
			}

		} while (opcion != 15);
		System.out.println("Heu sortit del menú.");

		reader.close();

	}

}
