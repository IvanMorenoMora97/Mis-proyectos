package EXERCICI1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import EXERCICI1.LlegirElFitxer;
import EXERCICI1.EscriureEnFitxer;

/*
 * 
 *    Escriu un programa amb el següent menú d’opcions:
 * 
 * 1. Llegir paraules:  llegeixi per teclat paraules fins que l’usuari vulgui i les va emmagatzemant en un fitxer.
 * 
 * 2. Llegir paraules: Llegeix les paraules del fitxer i les mostra per pantalla.
 * 
 * 
 */

public class Exercici1 {

	public static void main(String[] args) {
		EscriureEnFitxer.escriureFitxer("Exercici1.txt");
		LlegirElFitxer.llegirFitxer("Exercici1.txt");
	}
}
