package Clases;

import java.io.Serializable;

public class Maquines extends Aules implements Serializable, Cloneable{

	private String nom;
	private String processador;
	private boolean grafica;

	// CONSTRUCTOR
	
	public Maquines() {}

	public Maquines(String nom, String processador, boolean grafica) {

		this.nom = nom;
		this.processador = processador;
		this.grafica = grafica;
	}
	
	//CLONADOR
	
	@Override
	public Maquines clone() {

		Maquines novaMaquina;

		try {
			
			novaMaquina = (Maquines) super.clone();
				
			return novaMaquina;

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
			return null;

		}

	}

	// METODES
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public boolean getGrafica() {
		return grafica;
	}

	public void setGrafica(boolean grafica) {
		this.grafica = grafica;
	}

	public void visualitzar() {
		
		System.out.println(toString());
		
	}
	
	@Override
	public String toString() {
		return "[\nnom=" + nom + ", \nprocessador=" + processador + ", \ngrafica=" + grafica + "]";
	}
	
	

}
