package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import Clases.Alumnes;
import Clases.INS;

public class leerFicheroXML {

	public static void LeerXML(String XMLAlumnes) {

		try {

			// LEER FICHERO XML

			File file = new File(XMLAlumnes);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(INS.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			INS institut = (INS) jaxbUnmarshaller.unmarshal(file);
			
			institut.visualitzar();
			
			
			
		} catch (JAXBException e) {

			e.printStackTrace();

		}

	}

}
