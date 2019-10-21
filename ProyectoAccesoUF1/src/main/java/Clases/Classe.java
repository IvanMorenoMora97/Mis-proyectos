package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Classe implements Serializable{

	private Aules aula;
	private Professors professor;
	private ArrayList<Alumnes> alumnos = new ArrayList<Alumnes>();

	// CONSTRUCTOR

	public Classe(Aules aula, Professors professor, ArrayList<Alumnes> alumnos) {
		super();
		this.aula = aula;
		this.professor = professor;
		this.alumnos = alumnos;
	}

	// METODOS
	public Aules getAula() {
		return aula;
	}

	public void setAula(Aules aula) {
		this.aula = aula;
	}

	public Professors getProfessor() {
		return professor;
	}

	public void setProfessor(Professors professor) {
		this.professor = professor;
	}

	public ArrayList<Alumnes> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumnes> alumnos) {
		this.alumnos = alumnos;
	}

}
