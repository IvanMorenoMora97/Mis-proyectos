package ProyectoAccesoUF1.ProyectoAccesoUF1;

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

import Clases.Aules;
import Clases.Maquines;

public class canviaMaquina {

	public static void canviar() {

		Scanner reader = new Scanner(System.in);

		ArrayList<Aules> aulas = new ArrayList<Aules>();
		ArrayList<Maquines> maquines = new ArrayList<Maquines>();
		Maquines mm = null;
		String MCanviar = null;

		String ACanviar = null;

		System.out.println("Indica la maquina a canviar: ");
		MCanviar = reader.nextLine();

		System.out.println("Indica a quina aula té que anar: ");
		ACanviar = reader.nextLine();

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

					mm = new Maquines(nom, proce, graf);

					Aules aul = new Aules(name, capacitat, aire, mm);
					aulas.add(aul);
				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		//MOSTRAR AULAS
		for (Aules a : aulas) {
			
			System.out.println(a);
			
		}
		
		

	}

}
