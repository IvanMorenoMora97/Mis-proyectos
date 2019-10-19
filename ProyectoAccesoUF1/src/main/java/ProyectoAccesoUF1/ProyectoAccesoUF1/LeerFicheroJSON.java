package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;

import Clases.Aules;
import Clases.Maquines;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class leerFicheroJSON {

	public static void LeerJSON(String FJSON) {

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

				
				
				// MAQUINES JSONARRAY

				JSONArray maquinas = (JSONArray) aules2.get("maquines");

				for (Object s : maquinas) {

					System.out.println("Nom: "+name+", capacitat: "+capacitat+", aireacondicionat: "+aireacondicionat+", maquines: "+s);

				}

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
