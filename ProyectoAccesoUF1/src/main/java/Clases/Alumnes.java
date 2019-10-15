package Clases;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"nom", "cognom", "DNI", "adreça", "mail", "telefonos"})
public class Alumnes {

	private String nom;
	private String cognom;
	private int DNI;
	private String adreça;
	private String mail;
	private ArrayList<Telefons> telefonos = new ArrayList<Telefons>();

	// METODOS
	@XmlElement(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElement(name = "cognoms")
	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	@XmlElement(name = "DNI")
	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	@XmlElement(name = "adreça")
	public String getAdreça() {
		return adreça;
	}

	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}

	@XmlElement(name = "mail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@XmlElementWrapper(name = "telefons")
	public ArrayList<Telefons> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefons> telefonos) {
		this.telefonos = telefonos;
	}

}
