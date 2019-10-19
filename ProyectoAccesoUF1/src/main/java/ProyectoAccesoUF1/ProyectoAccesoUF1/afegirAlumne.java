package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import Clases.Alumnes;
import Clases.INS;

public class afegirAlumne {

	public static void Añadir() {
		Scanner reader = new Scanner(System.in);

		Alumnes alumno;
		INS ins = null;
		ArrayList<Alumnes> alumnos = new ArrayList<Alumnes>();

		String nom = null;
		String cognoms = null;
		String DNI = null;
		String adreca = null;
		String mail = null;
		int telefon = 0;
		int introducir = 0;
		ArrayList<Integer> telefons = new ArrayList<Integer>();

		System.out.println("Introdueix un nom: ");
		nom = reader.nextLine();

		System.out.println("Introdueix un cognom: ");
		cognoms = reader.nextLine();

		System.out.println("Introdueix un DNI: ");
		DNI = reader.nextLine();

		System.out.println("Introdueix la adreça: ");
		adreca = reader.nextLine();

		System.out.println("Introdueix un mail: ");
		mail = reader.nextLine();

		System.out.println("Quants telefons vols introduir: ");
		introducir = reader.nextInt();

		while (introducir != 0) {

			System.out.println("Introdueix un telefon: ");
			telefon = reader.nextInt();
			telefons.add(telefon);

			introducir--;
		}

		alumno = new Alumnes(nom, cognoms, DNI, adreca, mail, telefons);

		// LEER FICHERO XML

		try {

			// CREAR FICHERO
			File file = new File("alumnes.xml");

			// CREAR NOU CONTEXT (CLASE ARREL)
			JAXBContext jaxbContext = JAXBContext.newInstance(INS.class);

			// CREAR UNMARSHALLER PER A LLEGIR
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// LLEGIR LA CLASSE I CANVIAR EL TIPUS DE CLASSE
			ins = (INS) jaxbUnmarshaller.unmarshal(file);

			// AFEGIM L'ALUMNE PREVIAMENT CREAT
			ins.add(alumno);
			System.out.println(ins.getNom() + "    " + ins.getAlumnes());

		} catch (JAXBException e) {

			e.printStackTrace();

		}

		System.out.println();

		// ESCRIBIR FICHERO XML

		try {

			// CREAR FITXER
			File file = new File("alumnes.xml");

			// CREAR NOU CONTEXT QUE SERÀ LA CLASSE ARREL
			JAXBContext jaxbContext = JAXBContext.newInstance(INS.class);

			// CREAR CLASSE MARSHALLER PER A ESCRIURE
			Marshaller marshallerObj = jaxbContext.createMarshaller();

			// POSAR PROPIETATS
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshallerObj.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

			// GUARDAR AL FITXER EL NOU INSTITUT AMB ELS NOUS ALUMNES
			marshallerObj.marshal(ins, new FileOutputStream(file));

		} catch (JAXBException e) {

			e.printStackTrace();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

}
