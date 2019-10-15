package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AfegirProfessor {

	public static void Afegir(String fichero) {
		Scanner reader = new Scanner(System.in);

		ArrayList<String> lista = new ArrayList<String>();

		String nomcognom = null;

		File f = new File(fichero);
		FileReader fr;
		BufferedReader br;

		FileWriter fw = null;

		try {

			System.out.println("Introdueix el cognom y nom del professor separat per coma: ");
			nomcognom = reader.nextLine();

			fr = new FileReader(f);
			br = new BufferedReader(fr);

			while (br.ready()) {

				lista.add(br.readLine().toString());

			}
			lista.add(nomcognom);

			Collections.sort(lista);

			fw = new FileWriter(fichero, false);

			for (String string : lista) {

				fw.write("\n" + string);

			}

			fw.close();

		} catch (Exception ex) {

			System.out.println("Missatge de la excepció: " + ex.getMessage());

		}

	}

}
