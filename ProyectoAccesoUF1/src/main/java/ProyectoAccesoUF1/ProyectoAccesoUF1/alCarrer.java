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

public class alCarrer {

	public static void Eliminar() {
		Scanner reader = new Scanner(System.in);
		INS ins = null;
		Alumnes alumno = null;

		String eliminar = null;

		System.out.println("Indica el nom del alumne a eliminar: ");
		eliminar = reader.nextLine();

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

		} catch (JAXBException e) {

			e.printStackTrace();

		}

		// COMPROBAMOS EN QUE INDICE DEL ARRAY ESTA EL ALUMNO
		int indice = 0;
		for (Alumnes a : ins.getAlumnes()) {

			if (a.getNom().equals(eliminar)) {

				indice = ins.getAlumnes().indexOf(a);

			}

		}

		//ELIMINAMOS AL ALUMNO DEL ARRAY MEDIANTE EL INDICE OBTENIDO
		ins.getAlumnes().remove(indice);

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
