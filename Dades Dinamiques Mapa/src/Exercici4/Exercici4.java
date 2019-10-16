package Exercici4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Map<String, String> programesVersions = new HashMap<String, String>();

		// PROGRAMES AMB LES VERSIONS
		programesVersions.put("Firefox", "3.5");
		programesVersions.put("Premiere", "CS3");
		programesVersions.put("After Effects", "CS3");
		programesVersions.put("Photoshop", "CS4");
		programesVersions.put("Gimp", "2.0.2");
		programesVersions.put("Python", "2.6.2");
		programesVersions.put("SnagIt", "7.0.1");

		int opcion = 0;
		String buscarV = null;
		String p = null;
		String v = null;
		boolean trobat = false;
		boolean esta = false;

		do {

			System.out.println();
			
			System.out.println("1. Mostrar llista.");
			System.out.println("2. Consultar versió.");
			System.out.println("3. Afegir un nou programa.");
			System.out.println("4. Sortir.");
			opcion = reader.nextInt();
			
			System.out.println();

			switch (opcion) {

			case 1:

				// MOSTRAR PROGRAMAS Y SUS VERSIONES

				Iterator clave = programesVersions.keySet().iterator();
				Iterator valor = programesVersions.values().iterator();

				while (clave.hasNext()) {
					String programa = (String) clave.next();
					String version = (String) valor.next();
					System.out.println("Programa: " + programa + ", Versió: " + version);
				}

				break;

			case 2:

				System.out.println("Introdueix la versió del programa a buscar: ");
				buscarV = reader.next();
				// CONSULTAR VERSION DEL PROGRAMA

				Iterator clave2 = programesVersions.keySet().iterator();
				Iterator valor2 = programesVersions.values().iterator();

				while (clave2.hasNext()) {
					String programa = (String) clave2.next();
					String version = (String) valor2.next();

					if (buscarV.equals(version)) {

						trobat = true;

						System.out.println("Programa: " + programa + ", Versió: " + version);

					}

				}

				if (trobat == false) {

					System.out.println("No s'ha trobat el programa amb la versió introduida.");

				}

				break;

			case 3:
				System.out.println("Introdueix el nom del programa: ");
				p = reader.nextLine();
				p = reader.nextLine();

				System.out.println("Introdueix la versió del programa: ");
				v = reader.nextLine();

				Iterator clave3 = programesVersions.keySet().iterator();
				Iterator valor3 = programesVersions.values().iterator();

				while (clave3.hasNext()) {
					String programa2 = (String) clave3.next();
					String version2 = (String) valor3.next();

					if (p.equals(programa2)) {

						esta = true;

					}

				}

				if (esta == false) {

					programesVersions.put(p, v);

				} else {

					System.out.println("El programa que vols introduir ja esta en la llista.");

				}

				break;

			}

		} while (opcion != 4);
		System.out.println("Heu sortir del menú.");

		reader.close();

	}

}
