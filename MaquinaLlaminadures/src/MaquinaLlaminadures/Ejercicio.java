package MaquinaLlaminadures;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String[][] nombresGolosinas = { { "KitKat", "Chicles Fresa", "Lacasitos ", "Palotes" },
				{ "Kinder Bueno", "Haribo", "Chetoos", "Twix" },
				{ "Kinder Bueno ", "M&M'S", "Papa Delta", "Chicles Menta" },
				{ "Lacasitos", "Crunch", "Milkybar", "KitKat " } };

		double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
				{ 1.5, 1.1, 1.1, 1.1 } };

		int j = 0;
		ArrayList<String> estoc = new ArrayList<String>();

		while (j < 5) {

			estoc.add("KitKat");
			estoc.add("Palotes");
			estoc.add("Lacasitos");
			estoc.add("Chicles Fresa");
			estoc.add("Kinder Bueno");
			estoc.add("Haribo");
			estoc.add("Chetoos");
			estoc.add("Twix");
			estoc.add("M&M'S");
			estoc.add("Papa Delta");
			estoc.add("Chicles Menta");			//NOTA IMPORTANT
			estoc.add("Crunch");
			estoc.add("Milkybar");				
			estoc.add("KitKat "); 				//He posat els espais en les paraules que es repeteixen per a poder distinguir-les ja que a l'hora de recarregar-ho hem recarregaba els dos productes 
			estoc.add("Lacasitos ");			//i d'aquesta forma podem distinguir els productes que estan repetits.
			estoc.add("Kinder Bueno ");			//Les paraules repetides i que tenen espais són: KitKat/KitKat(espai), Lacasitos/Lacasitos(espai), Kinder Bueno/Kinder Bueno(espai).

			j++;
		}

		boolean acabar;
		boolean encontrado;
		boolean salida;
		int i = 0;
		int opcion = 0;
		int quantitat = 0;
		int posiciof = 0;
		int posicioc = 0;
		double monedas = 0;
		double summonedas = 0;
		String numero;
		String fil;
		String col;

		String contrassenya;
		String producte;

		do {
			salida = false;

			System.out.println("1. Demanar llaminadura.");
			System.out.println("2. Mostrar llaminadures.");
			System.out.println("3. Reomplir llaminadures.");
			System.out.println("4. Introduïr monedes.");
			System.out.println("5. Retornar monedes.");
			System.out.println("6. Apagar màquina.");
			opcion = reader.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Indica la posició de la llaminadura: ");
				numero = reader.next();

				fil = numero.substring(0, numero.length() - 1);
				col = numero.substring(1, numero.length());

				posiciof = Integer.parseInt(fil);
				posicioc = Integer.parseInt(col);

				if (posiciof >= 0 && posiciof <= 3 && posicioc >= 0 && posicioc <= 3) {
					for (int f = 0; f < nombresGolosinas.length; f++) {
						for (int c = 0; c < nombresGolosinas.length; c++) {

							if (f == posiciof && c == posicioc) {

								System.out.println();
								System.out.println("Producte sel·leccionat: " + nombresGolosinas[f][c]);

								if (estoc.contains(nombresGolosinas[f][c])) {
									if(summonedas>=precio[f][c]) {
										
									summonedas=summonedas-precio[f][c];
									System.out.println("Preu actual en la màquina: "+String.format("%.2f", summonedas));
									estoc.remove(nombresGolosinas[f][c]);
									System.out.println();
									
									}
									else {
										
										System.out.println("No tens suficients diners, ingresa més.");
										
									}

								} else {
									nombresGolosinas[f][c] = nombresGolosinas[f][c] + '*';
									System.out.println("Ja no hi queden unitats.");
									System.out.println();

								}
							}

						}
					}
				} else {

					System.out.println("Fila o columna erronea.");

				}
				break;

			case 2:

				for (int f = 0; f < nombresGolosinas.length; f++) {

					for (int c = 0; c < nombresGolosinas.length; c++) {

						System.out.print(" | " + nombresGolosinas[f][c] + "  "+ precio[f][c] + "\t ");

					}
					System.out.println("\n");
				}

				break;

			case 3:
				encontrado = false;

				System.out.println("Introdueix la contrassenya per a accedir: ");

				contrassenya = reader.nextLine();
				contrassenya = reader.nextLine();
				if (contrassenya.contains("Chuches2018")) {
					System.out.println("Benvingut.");

					System.out.println("Introdueix el producte que vols omplir: ");
					producte = reader.nextLine();

					for (int f = 0; f < nombresGolosinas.length; f++) {
						for (int c = 0; c < nombresGolosinas.length; c++) {

							if (nombresGolosinas[f][c].equals(producte)
									|| nombresGolosinas[f][c].equals(producte + '*')) {

								nombresGolosinas[f][c] = producte;
								encontrado = true;

								if (encontrado) {
									System.out.println("Introdueix una quantitat: (De 0 a 4.)"); //He posat del 0 al 4 ja que si introduïm el numero 4 ens recarrega 5 productes i el 0 ens recarrega només un producte.
									quantitat = reader.nextInt();

									if (quantitat <= 4 && quantitat >= 1)
										while (i < quantitat) {

											estoc.add(nombresGolosinas[f][c]);

											i++;
										}
									if(quantitat==0) {
										
										estoc.add(nombresGolosinas[f][c]);
										
									}
									System.out.println("Producte recarregat.");

								} else {

									System.out.println("Producte no trobat.");

								}

							}
						}

					}

				}

				else {

					System.out.println();
					System.out.println("Error, contrassenya incorrecta.");
					System.out.println();

				}

				break;

			case 4:
				acabar = false;
				do {
					System.out.println();
					System.out.println(
							"Introdueix una de les següents monedes: (0,01 ctms,   0,02 ctms,   0,05 ctms,   0,10 ctms,   0,20 ctms,   0,50 ctms,   1,00 €)");
					System.out.println("Si vols sortir del submenú introdeix el següent numero: 0");
					monedas = reader.nextDouble();

					if (monedas == 0.01 || monedas == 0.02 || monedas == 0.05 || monedas == 0.10 || monedas == 0.20
							|| monedas == 0.50 || monedas == 1.00) {

						summonedas = summonedas + monedas;
						System.out.println("Monedes acumulades: " +String.format("%.2f", summonedas));

					}

					if (monedas == 0) {

						acabar = true;

					}

				} while (!acabar);
				System.out.println("Heu sortit del submenú");
				System.out.println();

				break;

			case 5:		System.out.println("Monedes retornades: "+String.format("%.2f", summonedas));
						summonedas=0;
						System.out.println("Monedes introduides actualment: "+String.format("%.2f", summonedas));
						System.out.println();
				break;

			case 6:
				salida = true;
				break;

			}

		} while (!salida);
		System.out.println("Heu sortit del menú.");

		reader.close();

	}

}
