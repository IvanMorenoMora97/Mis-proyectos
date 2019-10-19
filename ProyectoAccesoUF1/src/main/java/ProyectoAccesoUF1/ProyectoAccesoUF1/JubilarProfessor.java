package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class jubilarProfessor {

	public static void Jubilar(String fichero) {
		Scanner reader = new Scanner(System.in);
		File f;
		FileReader fr;
		BufferedReader br;

		ArrayList<String> lista = new ArrayList<String>();

		String eliminar = null;

		f = new File(fichero);

		FileWriter fw = null;

		try {

			System.out.println("Escriu el cognom i nom del professor a eliminar separats per una coma: ");
			eliminar = reader.nextLine();

			fr = new FileReader(f);
			br = new BufferedReader(fr);

			// AÑADIMOS LA LISTA AL ARRAY
			while (br.ready()) {

				lista.add(br.readLine().toString());

			}

			// ELIMINAMOS EL NOMBRE DEL PROFESSOR
			for (int i = 0; i < lista.size(); i++) {

				if (lista.get(i).equals(eliminar)) {

					System.out.println("ENCONTRADO");
					
					lista.remove(i);
					
				}

			}

			// ORDENAMOS EL ARRAY
			Collections.sort(lista);

			// ESCRIBIMOS EN EL FICHERO
			fw = new FileWriter(fichero, false);

			for (String string : lista) {

				fw.write("\n" + string);

			}

			fw.close();

		} catch (IOException e) {
			System.err.println("No puc llegir el fitxer");

		}

	}

}
