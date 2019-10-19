package Clases;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name="institut")
@XmlType(propOrder = { "nom", "alumnes" })
public class INS {

	private String nom;
	private ArrayList<Alumnes> alumnes = new ArrayList<Alumnes>();

	// METODES
	public void add(Alumnes a) {
		
		this.alumnes.add(a);
		
	}
	
	
	@XmlElement(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElementWrapper(name = "alumnes")
	@XmlElement (name="alumne")
	public ArrayList<Alumnes> getAlumnes() {
		return alumnes;
	}

	public void setAlumnes(ArrayList<Alumnes> alumnes) {
		this.alumnes = alumnes;
	}

	public void visualitzar() {
		
		
		System.out.println(toString());
		
	}
	
	@Override
	public String toString() {
		return "INS [nom=" + nom + ",\n alumnes=" + alumnes + "]";
	}

}
