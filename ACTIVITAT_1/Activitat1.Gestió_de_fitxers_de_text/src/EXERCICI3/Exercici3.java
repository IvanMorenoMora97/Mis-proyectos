package EXERCICI3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String directorio = null;
		String fichero = null;

		System.out.println("Escribe el directorio a buscar: ");
		directorio = reader.next();

		System.out.println("Escribe el nombre del fichero: ");
		fichero = reader.next();

		Fitxer.Lectura(directorio, fichero);

		reader.close();

	}

}
