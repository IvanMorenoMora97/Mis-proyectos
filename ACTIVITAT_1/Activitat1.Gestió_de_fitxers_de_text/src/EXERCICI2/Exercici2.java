package EXERCICI2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import EXERCICI1.EscriureEnFitxer;

public class Exercici2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int opcion = 0;
		String palabras = null;
		boolean salir = false;
		do {
			System.out.println("Sel·lecciona una de les següents opcions:");
			System.out.println("1. Introduir paraules.");
			System.out.println("2. Guardar paraules a un fitxer de text.");
			System.out.println("3. Llegir paraules d'un fitxer de text.");
			System.out.println("4. Sortir del menú.");
			opcion = reader.nextInt();

			switch (opcion) {

			case 1:
				// Añadir palabras en arraylist
				System.out.println("Introduce la palabra que quieres añadir: ");
				palabras = reader.next();

				// Meter las palabras del arraylist en un fichero
				Esciure.ArrayLista(palabras);

				break;

			case 2:
				Esciure.AñadirALista();

				break;

			case 3:
				// Mostrar palabras del fichero
				Llegir.llegirFitxer("Exercici2.txt");
				break;

			case 4:
				salir = true;
				break;

			}

		} while (!salir);
		System.out.println("Heu sortit del menú.");

		reader.close();

	}

}
