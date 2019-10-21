package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Clases.Classe;

public class leerDAT {

	public static void leer(String ficheroDAT) {

		try {

			FileInputStream fis = new FileInputStream("classes.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Classe c;

			try {

				while (true) {

					Object o = ois.readObject();

					if (o instanceof Classe) {

						c = (Classe) o;

						System.out.println(c);

					}

				}

			} catch (EOFException fin) {

				System.out.println("Fi de la lectura");
				ois.close();

			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
