package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Aules implements Serializable {

	private String nom;
	private long capacitat;
	private boolean aireacondicionat;
	private ArrayList<Maquines> maquines = new ArrayList<Maquines>();

	public Aules() {
	}

	public Aules(String nom, long capacitat, boolean aire, Maquines maquina) {

		this.nom = nom;
		this.aireacondicionat = aire;
		this.capacitat = capacitat;
		this.maquines.add(maquina);
		//= maquina;

	}

	// METODES
	public void add(Maquines m) {
		
		this.maquines.add(m);
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(long capacitat) {
		this.capacitat = capacitat;
	}

	public boolean getAireacondicionat() {
		return aireacondicionat;
	}

	public void setAireacondicionat(boolean aireacondicionat) {
		this.aireacondicionat = aireacondicionat;
	}

	public ArrayList<Maquines> getMaquines() {
		return maquines;
	}

	public void setMaquines(ArrayList<Maquines> maquines) {
		this.maquines = maquines;
	}

	public void visualitzar() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "[\nnom=" + nom + ", \ncapacitat=" + capacitat + ", \naireacondicionat=" + aireacondicionat
				+ ", maquines=" + maquines + "]";
	}

}
