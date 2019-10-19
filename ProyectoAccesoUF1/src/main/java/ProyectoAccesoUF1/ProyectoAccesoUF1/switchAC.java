package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Clases.Aules;
import Clases.Maquines;

public class switchAC {

	public static void habilitarAire(String FJSON) {
		Scanner reader = new Scanner(System.in);

		String NAula = null;
		ArrayList<Aules> aulas = new ArrayList<Aules>();
		ArrayList<Maquines> maquinitas = new ArrayList<Maquines>();

		Maquines maquina = null;
		Aules aula = null;

		System.out.println("Escriu el nom de l'aula per ha habilitar o deshabilitar l'aire acondicionat: ");
		NAula = reader.nextLine();

		// METER TODO EL FICHERO EN UN ARRAY Y LUEGO AÑADIR EL NUEVO Y VOVLER A GRABAR

		JSONParser parser = new JSONParser();
		Object obj;

		try {

			obj = parser.parse(new FileReader("aules.json"));

			JSONArray array = (JSONArray) obj;

			for (Object o : array) {

				JSONObject aulitas = (JSONObject) o;

				String name = (String) aulitas.get("nom");
				long capacitat = Long.parseLong(aulitas.get("capacitat").toString());
				boolean aire = Boolean.parseBoolean(aulitas.get("aireacondicionat").toString());

				JSONArray machine = (JSONArray) aulitas.get("maquines");

				for (Iterator iterator = machine.iterator(); iterator.hasNext();) {

					Object objeto = (Object) iterator.next();
					JSONObject maquina2 = (JSONObject) objeto;

					String nom = (String) maquina2.get("nom");
					String proce = (String) maquina2.get("processador");
					boolean graf = Boolean.parseBoolean(maquina2.get("grafica").toString());

					Maquines mm = new Maquines(nom, proce, graf);
					// maquinitas.add(mm);
					Aules aul = new Aules(name, capacitat, aire, mm);
					aulas.add(aul);
				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		// GRABAR ARRAYLIST EN EL FICHERO

		try (FileWriter file = new FileWriter("aules.json", false)) {

			JSONArray lista = new JSONArray();

			for (Aules aa : aulas) {

				Map<String, Object> aulitas = new LinkedHashMap<String, Object>();

				aulitas.put("nom", aa.getNom());
				aulitas.put("capacitat", aa.getCapacitat());
				
				//HABILITAR O DESHABILITAR AIRE ACONDICIONADO
				if(aa.getNom().equals(NAula)) {
					
					if(aa.getAireacondicionat()==true) {
						
						aa.setAireacondicionat(false);
						
					}
					else {
						
						aa.setAireacondicionat(true);
						
					}
					
				}
				
				aulitas.put("aireacondicionat", aa.getAireacondicionat());

				lista.add(aulitas);
				// MAQUINES JSONARRAY

				maquinitas = aa.getMaquines();

				JSONArray maquinas = new JSONArray();

				for (Maquines m : maquinitas) {

					Map<String, Object> maquinotes = new LinkedHashMap<String, Object>();

					maquinotes.put("nom", m.getNom());
					maquinotes.put("processador", m.getProcessador());
					maquinotes.put("grafica", m.getGrafica());

					maquinas.add(maquinotes);

				}

				aulitas.put("maquines", maquinas);

			}

			// ESCRIURE AL FITXER

			file.write(lista.toJSONString());
			file.flush();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
