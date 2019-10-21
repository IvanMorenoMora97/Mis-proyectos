package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Clases.Classe;

public class leerDAT {

	public static void leer(String ficheroDAT) {

		try {

			ObjectInputStream leerDAT = new ObjectInputStream(new FileInputStream(ficheroDAT));

			System.out.println((Classe) leerDAT.readObject());

			leerDAT.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
