package centre.educatiu;

public class Treballador extends Persona {

	private String numSS;
	private String adre�a;

	public Treballador(String nom, String adre�a, String numSS, String adre�aTreball) {

		super(nom, adre�a);
		this.numSS = numSS;
		this.adre�a = adre�aTreball;

	}

	public Treballador(Treballador treballador) {

		this.setNumSS(treballador.getNumSS());
		this.setAdre�a(treballador.getAdre�a());
	}

	public Treballador() {
	}

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}

	public String getAdre�a() {
		return adre�a;
	}

	public void setAdre�a(String adre�a) {
		this.adre�a = adre�a;
	}

	public void obtenirAdre�es() {

		System.out.println("Adre�a de treball: " + this.getAdre�a() + " i adre�a d' on viu: " + super.getAdre�a());

	}
	
	public void Visualitzar() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Treballador [numSS=" + numSS + ", adre�a=" + adre�a + ", getNom()=" + getNom() + "]";
	}
	
	

}
