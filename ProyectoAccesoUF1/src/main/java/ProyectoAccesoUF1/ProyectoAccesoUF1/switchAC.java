package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Clases.Aules;

public class switchAC {

	public static void habilitarAire(String FJSON) {
		Scanner reader = new Scanner(System.in);

		String NAula = null;

		System.out.println("Escriu el nom de l'aula per ha habilitar o deshabilitar l'aire acondicionat: ");
		NAula = reader.nextLine();

		JSONParser parser = new JSONParser();
		Object obj;

		try {

			obj = parser.parse(new FileReader(FJSON));

			JSONArray aules = (JSONArray) obj;

			for (Object o2 : aules) {

				JSONObject aules2 = (JSONObject) o2;

				String name = (String) aules2.get("nom");
				long capacitat = Long.parseLong(aules2.get("capacitat").toString());
				boolean aireacondicionat = Boolean.parseBoolean(aules2.get("aireacondicionat").toString());

				if (NAula.equals(name)) {

					if (aireacondicionat == false) {

						aireacondicionat = true;

					}

					else {

						aireacondicionat = false;

					}

				}

				// MAQUINES JSONARRAY

				JSONArray maquinas = (JSONArray) aules2.get("maquines");

				for (Object s : maquinas) {

					System.out.println("Nom: " + name + ", capacitat: " + capacitat + ", aireacondicionat: "
							+ aireacondicionat + ", maquines: " + s);

				}
				
				
				//ESCRIURE AL FITXER
				
				
				
				
				
				
				
				
				
				

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (ParseException e) {

			e.printStackTrace();

		}

	}

}
