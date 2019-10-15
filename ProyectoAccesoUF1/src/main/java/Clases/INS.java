package Clases;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "nom", "alumnes" })
public class INS {

	private String nom;
	private ArrayList<Alumnes> alumnes = new ArrayList<Alumnes>();

	// METODES
	@XmlElement(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElementWrapper(name = "alumnes")
	public ArrayList<Alumnes> getAlumnes() {
		return alumnes;
	}

	public void setAlumnes(ArrayList<Alumnes> alumnes) {
		this.alumnes = alumnes;
	}

}
