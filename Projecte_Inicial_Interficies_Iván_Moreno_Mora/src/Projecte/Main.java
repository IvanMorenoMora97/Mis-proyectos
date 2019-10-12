package Projecte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Classes.Hospital;
import Classes.Malalties;
import Classes.OrdenarPorId;
import Classes.OrdenarPorInfectados;
import Classes.OrdenarPorMuertos;
import Classes.OrdenarPorPias;
import Classes.Vacunas;

public class Main {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Malalties> lista = new ArrayList<Malalties>(); // ARRAYLIST PARA ALMACENAR LOS OBJETOS DE TIPO
																	// MALALTIA Y PODER ORDENARLOS SEGUN EL CAMPO

		Malalties m = null;
		Vacunas vacuna = null;
		int opcion = 0;
		int CLcubics = 0;
		String tipus = null;
		String NCientific = null;
		String distribuidor = null;
		String nom = null;
		String transmissió = null;
		int Qinf = 0;
		boolean verificarMorts = false;
		int morts = 0;
		String pais = null;
		int id = 0;
		int buscar_id = 0;

		Hospital<Vacunas> hospitalV = new Hospital<Vacunas>();
		Hospital<Malalties> hospitalM = new Hospital<Malalties>();

		System.out.println("Programa per a enllistar, ordenar i clonar malalties");
		System.out.println();

		do {

			opcion = Menú();

			switch (opcion) {

			case 1:

				System.out.println("Tipus de malaltia: ");
				tipus = reader.nextLine();
				tipus = reader.nextLine();

				System.out.println("Nom de la malaltia: ");
				nom = reader.nextLine();

				System.out.println("Via de transmissió: ");
				transmissió = reader.nextLine();

				System.out.println("Quanta gent ha sigut infectada?");
				Qinf = reader.nextInt();

				System.out.println("Quanta gent ha mort?");
				morts = reader.nextInt();

				if (morts <= Qinf) {

					verificarMorts = true;

				}

				System.out.println("En quin/quins paisos ha aparegut?");
				pais = reader.nextLine();
				pais = reader.nextLine();

				System.out.println("Identificador de la malaltia:");
				id = reader.nextInt();

				if (verificarMorts) {

					m = new Malalties(transmissió, morts, Qinf, tipus, nom, pais, id);

					lista.add(m); // AÑADIMOS LA ENFERMEDAD CREADA AL ARRAYLIST DE ENFERMEDADES

					hospitalM.add(m); // AÑADIMOS LA ENFERMEDAD AL ARRAYLIST GENERICO DE HOSPITAL

				}

				else {

					System.out.println(
							"No s'ha pogut introduir la malaltia degut a que no poden haber mes morts que persones infectades.");

				}

				break;

			case 2: // ORDENAR LISTA POR NOMBRE

				Collections.sort(lista);

				System.out.println();
				System.out.println("Llista de les malalties ordenades per nom: " + lista);
				System.out.println();

				break;

			case 3: // ORDENAR LISTA POR ID

				Collections.sort(lista, new OrdenarPorId());

				System.out.println();
				System.out.println("Llista de les malalties ordenades per ID: " + lista);
				System.out.println();

				break;

			case 4: // ORDENAR LISTA POR PAIS

				Collections.sort(lista, new OrdenarPorPias());

				System.out.println();
				System.out.println("Llista de les malalties ordenades per pais: " + lista);
				System.out.println();

				break;

			case 5: // ORDENAR LISTA POR MUERTOS

				Collections.sort(lista, new OrdenarPorMuertos());

				System.out.println();
				System.out.println("Llista de les malalties ordenades per morts: " + lista);
				System.out.println();

				break;

			case 6: // ORDENAR LISTA POR INFECTADOS

				Collections.sort(lista, new OrdenarPorInfectados());

				System.out.println();
				System.out.println("Llista de les malalties ordenades per infectats: " + lista);
				System.out.println();

				break;

			case 7: // CLONAR ENFERMEDAD

				Malalties clon = null;

				boolean encontrado = false;

				System.out.println("Clona l' enfermetat mitjançant un ID: ");
				buscar_id = reader.nextInt();

				for (int i = 0; i < lista.size(); i++) {

					m = lista.get(i);

					if (m.getId() == buscar_id) {

						clon = m.clone();

						encontrado = true;

					}

				}

				if (encontrado) {

					System.out.println("S'ha clonat amb exit.");

					lista.add(clon);

				}

				else {

					System.out.println("No s'ha trobat l' ID.");

				}

				break;

			case 8: // ACTUALIZAR ENFERMEDAD

				System.out.println("Introdueix l'ID de la malaltia que vols actualitzar:");
				buscar_id = reader.nextInt();

				System.out.println(
						"Introdueix el camp que vols actualitzar: (1.nom, 2.tipus, 3.tipus de transmissió, 4.infectats, 5.morts, 6.pais, 7.id)");
				opcion = reader.nextInt();

				switch (opcion) {

				case 1: // ACTUALIZAR NOMBRE

					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id) {

							System.out.println("Introdueix el nou nom: ");
							nom = reader.nextLine();
							nom = reader.nextLine();

							m.setNomMalaltia(nom);
						}

					}

					break;

				case 2: // ACTUALIZAR EL TIPO

					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id) {

							System.out.println("Introdueix el tipus de malaltia: ");
							tipus = reader.nextLine();
							tipus = reader.nextLine();

							m.setTipusMalaltia(tipus);
						}

					}

					break;

				case 3: // ACTUALIZAR TRANSMISIÓN

					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id) {

							System.out.println("Introdueix el tipus de transmissió: ");
							transmissió = reader.nextLine();
							transmissió = reader.nextLine();

							m.setTipusTransmisio(transmissió);
						}

					}

					break;

				case 4: // ACTUALIZAR INFECTADOS

					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id) {

							System.out.println("Introdueix la nova quantitat d'infectats: ");
							Qinf = reader.nextInt();

							m.setInfecció(Qinf);
						}

					}

					break;

				case 5: // ACTUALIZAR MUERTOS

					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id) {

							System.out.println("Introdueix la nova quantitat de morts: ");
							morts = reader.nextInt();

							m.setMorts(morts);
						}

					}

					break;

				case 6: // ACTUALIZAR PAIS

					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id) {

							System.out.println("Introdueix el nou pais: ");
							pais = reader.nextLine();
							pais = reader.nextLine();

							m.setPaisos(pais);
						}
					}

					break;

				case 7: // ACTUALIZAR ID
					boolean cambiado = false;
					System.out.println("Introdueix el nou ID: ");
					id = reader.nextInt();
					for (int i = 0; i < lista.size(); i++) {

						m = lista.get(i);

						if (m.getId() == buscar_id && !cambiado) {

							m.setId(id);
							cambiado = true;
						}

					}
					break;

				}

				break;

			case 9:
				System.out.println("Introdueix l'id a buscar: ");
				buscar_id = reader.nextInt();

				for (int i = 0; i < lista.size(); i++) {

					m = lista.get(i);

					if (m.getId() == buscar_id) {

						System.out.println(lista.get(i));

					}
				}

				break;

			case 10:

				System.out.println("Introdueix el nom de la vacuna: ");
				nom = reader.nextLine();
				nom = reader.nextLine();

				System.out.println("Nom cientific: ");
				NCientific = reader.nextLine();

				System.out.println("Centilitres cubics:");
				CLcubics = reader.nextInt();

				System.out.println("Distribuidor: ");
				distribuidor = reader.nextLine();
				distribuidor = reader.nextLine();

				vacuna = new Vacunas(nom, NCientific, CLcubics, distribuidor);

				System.out.println("Vacuna introduida.");

				hospitalV.add(vacuna); // AÑADIMOS LA VACUNA AL ARRAYLIST GENERICO DE HOSPITAL

				break;

			case 11: // VACUNAS Y ENFERMEDADES CON GENERALIZABLE

				// MOSTRAR VACUNAS CON ITERABLE
				for (Vacunas v : hospitalV) {

					v.visualitzar();

				}

				// MOSTRAR ENFERMEDADES CON ITERABLE
				for (Malalties ma : hospitalM) {

					ma.visualitzar();

				}

				break;

			}

		} while (opcion != 12);
		System.out.println("Heu sortit del menú");

		reader.close();

	}

	public static int Menú() {

		int opcion = 0;

		System.out.println("1.	Introduir les dades de la malaltia.");
		System.out.println("2.	Ordenar la llista per nom.");
		System.out.println("3.	Ordenar la llista per id.");
		System.out.println("4.	Ordenar la llista per paisos.");
		System.out.println("5.	Ordenar la llista per morts.");
		System.out.println("6.	Ordenar la llista per infectats.");
		System.out.println("7.	Clonar malaltia.");
		System.out.println("8.	Actualitzar malaltia mediante ID.");
		System.out.println("9.	Buscar malaltia mitjançant el seu identificador.");
		System.out.println("10.	Introdueix una vacuna.");
		System.out.println("11.	Mostrar vacunes i malalties.");
		System.out.println("12.	Sortir del menú");
		opcion = reader.nextInt();

		return opcion;

	}

}
