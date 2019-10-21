package Clases;

import java.io.Serializable;

public class Professors implements Serializable{

	private String p;
	

	
	
	//CONSTRUCTORS
	public Professors(String p) {
		
		this.p = p;

	}


	// METODES
	public String getP() {
		return p;
	}

	public void setP(String nom) {
		this.p = nom;
	}

	

}
