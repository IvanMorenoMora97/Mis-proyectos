package centre.educatiu;

public class Persona {

	private String nom;
	private String adre�a;

	public Persona(String nom, String adre�a) {

		this.nom = nom;
		this.adre�a = adre�a;

	}

	public Persona() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdre�a() {
		return adre�a;
	}

	public void setAdre�a(String adre�a) {
		this.adre�a = adre�a;
	}

	public void Visualitzar() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", adre�a=" + adre�a + "]";
	}

}
