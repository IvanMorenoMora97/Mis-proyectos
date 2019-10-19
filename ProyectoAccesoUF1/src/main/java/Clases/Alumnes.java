package Clases;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "nom", "cognoms", "DNI", "adreca", "telefonos", "mail" })
public class Alumnes {

	private String nom;
	private String cognoms;
	private String DNI;
	private String adreca;
	private String mail;
	private ArrayList<Integer> telefonos = new ArrayList<Integer>();

	// CONSTRUCTOR

	public Alumnes(String nom, String cognoms, String dNI, String adreca, String mail, ArrayList<Integer> telefonos) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.DNI = dNI;
		this.adreca = adreca;
		this.mail = mail;
		this.telefonos = telefonos;
	}
	
	public Alumnes() {}

	// METODOS
	@XmlElement(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElement(name = "cognoms")
	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognom) {
		this.cognoms = cognom;
	}

	@XmlElement(name = "DNI")
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@XmlElement(name = "adreca")
	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreça) {
		this.adreca = adreça;
	}

	@XmlElement(name = "mail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@XmlElementWrapper(name = "telefons")
	@XmlElement(name = "telefon")
	public ArrayList<Integer> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Integer> telefonos) {
		this.telefonos = telefonos;
	}

	public void visualitzar() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "[\n nom=" + nom + ", cognoms=" + cognoms + ", DNI=" + DNI + ", adreça=" + adreca + ", mail=" + mail
				+ ", \n telefonos=" + telefonos + "]";
	}

}
