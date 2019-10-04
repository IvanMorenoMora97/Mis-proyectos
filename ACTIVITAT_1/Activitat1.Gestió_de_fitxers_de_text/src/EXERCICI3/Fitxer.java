package EXERCICI3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fitxer {

	public static void Lectura(String directorio, String fichero) {

		Scanner reader = new Scanner(System.in);
		String fichero2 = null;
		String enter = null;
		int count = 0;

		boolean maslineas = false;

		File f = new File(directorio);

		if (f.exists()) {

			System.out.println("Directorio existente: " + f);

			File[] ficheros = f.listFiles();

			String kk = directorio + fichero;
			int lineas=0;
			File ff = new File(kk);

			if (ff.exists()) {

				for (int i = 0; i < ficheros.length; i++) {

					if (ficheros[i].isFile()) { // Saber si es un fichero

						// System.out.println("Archivo encontrado: " + ficheros[i].getName());

						fichero2 = ficheros[i].getName();

						if (fichero2.equals(fichero)) { // Comprobamos si el fichero que queremos buscar existe

							System.out.println("El fichero " + ficheros[i].getName() + " ha sido encontrado.");
							try {

								FileReader fr = new FileReader(ff);
								BufferedReader br = new BufferedReader(fr);

								// CONTAR CUANTAS LINEAS TIENE UN FICHERO
								lineas=0;
								lineas=(int)br.lines().count();
								br.close();
								fr.close();
								fr = new FileReader(ff);								
								br = new BufferedReader(fr);
														
								String linea = null;

								 System.out.println("El fichero contiene "+lineas+" lineas. ");

								System.out.println(
										"Vamos a proceder a mostrar sus primeras 10 lineas: (Para mostrar las ultimas 10 lineas que quedan presiona ENTER)");
								count=0;
								linea = br.readLine();
								System.out.println("..."+linea+"....");
										
								while (linea != null) {

									if (count != 10) {
										System.out.println(linea);
										count++;
									}

									if (count == 10) {
										System.out.println(
												"Ja s'han mostrat les 10 primeres linies vols mostrar les 10 linies restants? (PRESIONA ENTER PER A MOSTRARLES SINO ESCRIU QUALSEVOL COSA)");

										enter = reader.nextLine();
										if (enter.isEmpty()) {

											count = 0;

										}

										else {
											System.out.println("Ja no es mostraran més linies.");
											break;

										}

									}
									linea = br.readLine();

								}

							} catch (IOException e) {

								e.printStackTrace();

							}

						}

					}

					if (ficheros[i].isDirectory()) { // Saber si es una carpeta

						// System.out.println("Carpeta encontrado: " + ficheros[i].getName());

					}

				}
			} else {

				System.out.println("El archivo no existe");

			}

		} else {

			System.out.println("El directorio no existente");

		}

	}

}
