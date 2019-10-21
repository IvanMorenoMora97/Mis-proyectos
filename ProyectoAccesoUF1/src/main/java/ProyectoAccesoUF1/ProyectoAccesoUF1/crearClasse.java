package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Clases.Alumnes;
import Clases.Aules;
import Clases.Classe;
import Clases.INS;
import Clases.Maquines;
import Clases.Professors;

public class crearClasse {

	public static void crear() {

		// CREAR PROFESSOR MEDIANTE LA LECTURA DEL FICHERO

		Professors profe = null;

		ArrayList<String> professores = new ArrayList<String>();

		String p = null;

		File f;
		FileReader fr;
		BufferedReader br;

		f = new File("professors.txt");

		try {

			fr = new FileReader(f);
			br = new BufferedReader(fr);

			while (br.ready()) {

				p = br.readLine();
				professores.add(p);
			}

		} catch (IOException e) {
			System.err.println("No puc llegir el fitxer");

		}

		// CREAMOS EL PROFESSOR DE MANERA RANDOM
		int random = (int) (Math.random() * professores.size());
		for (int i = 0; i < professores.size(); i++) {

			if (random == i) {

				profe = new Professors(professores.get(i));

			}

		}

		// CREACION DEL AULA

		// METER TODO EL FICHERO EN UN ARRAY Y LUEGO AÑADIR EL NUEVO Y VOVLER A GRABAR

		Aules aula = null;
		ArrayList<Aules> aulas = new ArrayList<Aules>();

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

		// SELECCIONAR AULA RANDOM

		int random2 = (int) (Math.random() * aulas.size());

		for (int i = 0; i < aulas.size(); i++) {

			if (i == random2) {

				aula = aulas.get(i); // SELECCIONAMOS EL AULA QUE UTILIZAREMOS EN EL FICHERO .BAT

			}

		}

		// ESCOGER 5 ALUMNOS DE MANERA ALEATORIA

		ArrayList<Alumnes> alumnos = new ArrayList<Alumnes>();

		int contador3 = 5;
		Alumnes a = null;

		while (contador3 != 0) {

			try {

				// LEER FICHERO XML

				File file = new File("alumnes.xml");

				JAXBContext jaxbContext = JAXBContext.newInstance(INS.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

				INS institut = (INS) jaxbUnmarshaller.unmarshal(file);

				// institut.visualitzar();

				int random3 = (int) (Math.random() * institut.getAlumnes().size());

				for (int i = 0; i < institut.getAlumnes().size(); i++) {

					if (i == random3) {

						a = institut.getAlumnes().get(i);
						alumnos.add(a);
					}

				}

			} catch (JAXBException e) {

				e.printStackTrace();

			}

			contador3--;
		}

		// AÑADIMOS TODOS LOS OBJETOS CREADOS A LA CLASSE

		Classe classe = new Classe(aula, profe, alumnos);

		ArrayList<Classe> classes = new ArrayList<Classe>();

		classes.add(classe);

		// GRABAR CLASSE EN FICHERO .DAT

		try {

			ObjectOutputStream escribirDAT = new ObjectOutputStream(new FileOutputStream("classes.dat"));
			escribirDAT.writeObject(classes);
			escribirDAT.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
