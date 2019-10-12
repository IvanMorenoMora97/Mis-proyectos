package Exercici2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Exercici2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int nombre1 = 0;
		int nombre2 = 0;
		int contador = 2;

		Map<Integer, Integer> divisorTOT = new HashMap<Integer, Integer>();
		Map<Integer, Integer> divisorUN = new HashMap<Integer, Integer>();
		Map<Integer, Integer> divisorCAP = new HashMap<Integer, Integer>();

		System.out.println("Introdueix el primer nombre: ");
		nombre1 = reader.nextInt();

		System.out.println("Introdueix el segon nombre: ");
		nombre2 = reader.nextInt();

		while (contador != 1000) {

			if (nombre1 % contador == 0 && nombre2 % contador == 0) {

				divisorTOT.put(contador, nombre1);
				divisorTOT.put(contador, nombre2);

			}

			if (nombre1 % contador == 0 || nombre2 % contador == 0) {

				if (nombre1 % contador == 0) {

					divisorUN.put(contador, nombre1);

				}

				if (nombre2 % contador == 0) {

					divisorUN.put(contador, nombre2);

				}

			}

			if (nombre1 % contador != 0 && nombre2 % contador != 0) {

				divisorCAP.put(contador, nombre1);
				divisorCAP.put(contador, nombre2);

			}

			contador++;
		}

		System.out.println();
		System.out.println();
		System.out.println("DIVISORES DE AMBOS");
		
		// DATOS DEL MAPA QUE CONTIENE LOS DIVISORES DE AMBOS
		Iterator it = divisorTOT.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key + " es divisor de  " + nombre1 + " y " + nombre2);
		}

		System.out.println();
		System.out.println();
		System.out.println("DIVISORES DE UNO DE ELLOS");

		// DATOS DEL MAPA QUE CONTIENE LOS DIVISORES DE UNO DE ELLOS
		Iterator it2 = divisorUN.keySet().iterator();
		Iterator valor2 = divisorUN.values().iterator();
		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			Integer value = (Integer) valor2.next();

			if (value == nombre1) {

				System.out.println(key + " es divisor de  " + nombre1);

			}

			if (value == nombre2) {

				System.out.println(key + " es divisor de  " + nombre2);

			}

		}

		System.out.println();
		System.out.println();
		System.out.println("LOS QUE NO SON DIVISORES DE AMBOS");

		// DATOS DEL MAPA QUE CONTIENE LOS QUE NO SON DIVISORES DE AMBOS
		Iterator it3 = divisorCAP.keySet().iterator();
		while (it3.hasNext()) {
			Integer key = (Integer) it3.next();
			System.out.println(key + " no es divisor de  " + nombre1 + " y " + nombre2);
		}

		reader.close();

	}

}
