package EXERCICI1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscriureEnFitxer {
	public static void escriureFitxer(String qFitxer) {
		Scanner reader = new Scanner(System.in);
		File f = new File(qFitxer);
		FileWriter fw;
		BufferedWriter out;
		boolean afegir = false;
		String paraula;
		try {
			System.out.println("Escriu el que vulguis. Per acabar, fica una línia en blanc");
			fw = new FileWriter(f, true);
			
			out = new BufferedWriter(fw);
			do {
				paraula = reader.nextLine();
				out.write(paraula + "\n"); // "\n" és el salto de linea, hay algunos editores de texto que no interpretan el salto de linea
			} while (paraula.length() > 0);
			out.flush();
			out.close();
			fw.close();
			reader.close();
		} catch (IOException e) {
			System.err.println("No s'ha pogut escriure el fitxer");
		}
	}

}
