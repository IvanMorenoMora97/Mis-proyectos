package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Clases.Aules;
import Clases.Maquines;

public class ComprarMaquina {

	public static void comprarMaquina() {
		Scanner reader = new Scanner(System.in);

		ArrayList<Aules> aulas = new ArrayList<Aules>();
		
		Maquines maquina = null;
		Aules aula = null;

		String nomAula = null;
		String nomMaquina = null;
		String processador = null;
		boolean grafica = false;
		long capacitatAula = 0;
		boolean aireacondicionat = false;
		char gr = 0;
		char air = 0;

		System.out.println("Introdueix el nom de l'aula: ");
		nomAula = reader.nextLine();

		System.out.println("Introdueix el nom de la maquina: ");
		nomMaquina = reader.nextLine();

		System.out.println("Introdueix el processador: ");
		processador = reader.nextLine();

		System.out.println("Té grafica? (S per a si i N per a no)");
		gr = reader.next().charAt(0);

		System.out.println("Introdueix la capacitat de l' aula: ");
		capacitatAula = reader.nextLong();

		System.out.println("L'aire acondicionat esta activat? (S per a si i N per a no)");
		air = reader.next().charAt(0);

		// DETERMINAR SI TÉ AIRE ACONDICIONAT

		if (air == 'S' || air == 's') {

			aireacondicionat = true;

		}
		if (air == 'N' || air == 'n') {

			aireacondicionat = false;

		}

		// DETERMINAR SI TÉ GRÀFICA

		if (gr == 'S' || gr == 's') {

			grafica = true;

		}
		if (gr == 'N' || gr == 'n') {

			grafica = false;

		}

		maquina = new Maquines(nomMaquina, processador, grafica);
		aula = new Aules(nomAula, capacitatAula, aireacondicionat, maquina);
		
		aulas.add(aula);

		//METER TODO EL FICHERO EN UN ARRAY Y LUEGO AÑADIR EL NUEVO Y VOVLER A GRABAR
		
		JSONParser parser = new JSONParser();
		Object obj;
		
		
		//LEER FICHERO DEL JSON Y CREAR LAS AULAS Y AÑADIRLAS A UN ARRAYLIST
		try {

			obj = parser.parse(new FileReader("aules.json"));

			JSONArray aules = (JSONArray) obj;

			for (Object o2 : aules) {

				JSONObject aules2 = (JSONObject) o2;

				String name = (String) aules2.get("nom");
				long capacitat = Long.parseLong(aules2.get("capacitat").toString());
				boolean aire = Boolean.parseBoolean(aules2.get("aireacondicionat").toString());

				
				
				// MAQUINES JSONARRAY

				JSONArray maquinas = (JSONArray) aules2.get("maquines");

				for (Object o : maquinas) {
					
					JSONObject maquinitas = (JSONObject) o;
					
					String nom = (String) maquinitas.get("nom");
					String proces = (String) maquinitas.get("processador");
					boolean grafi = Boolean.parseBoolean(maquinitas.get("grafica").toString());
					
					
					maquina = new Maquines(nom, proces, grafi);


				}
				
				aula = new Aules(name, capacitat, aire, maquina);

				aulas.add(aula);
				
				
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (ParseException e) {

			e.printStackTrace();

		}
		
		//GRABAR ARRAYLIST EN EL FICHERO
		
		
		
		
		
		
	}

}
