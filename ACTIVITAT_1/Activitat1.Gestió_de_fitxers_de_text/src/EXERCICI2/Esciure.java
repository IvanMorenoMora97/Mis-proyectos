package EXERCICI2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Esciure {

	private static ArrayList<String> Lista = new ArrayList();

	public static void AñadirALista() {
		String palabrita = null;
		try {

			FileOutputStream fs = new FileOutputStream("Exercici2.txt");
			DataOutputStream d = new DataOutputStream(fs);

			for (int i = 0; i < Lista.size(); i++) {

				palabrita = Lista.get(i);
				d.writeUTF(palabrita);

			}
			if (d != null) {

				d.close();
				fs.close();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public static void ArrayLista(String palabra) {

		Lista.add(palabra);

	}

	public static void MostrarLista() {

		for (int i = 0; i < Lista.size(); i++) {

			System.out.println(Lista.get(i));

		}

	}

}
