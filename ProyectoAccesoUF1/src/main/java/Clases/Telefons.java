package Clases;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "telefons" })
public class Telefons implements Serializable{

	private int telefons;

	// METODOS
	@XmlElement(name = "telefon")
	public int getTelefons() {
		return telefons;
	}

	public void setTelefons(int telefons) {
		this.telefons = telefons;
	}

}
