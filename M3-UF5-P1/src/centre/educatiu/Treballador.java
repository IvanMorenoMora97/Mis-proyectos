package centre.educatiu;

public class Treballador extends Persona {

	private String numSS;
	private String adreça;

	public Treballador(String nom, String adreça, String numSS, String adreçaTreball) {

		super(nom, adreça);
		this.numSS = numSS;
		this.adreça = adreçaTreball;

	}

	public Treballador(Treballador treballador) {

		this.setNumSS(treballador.getNumSS());
		this.setAdreça(treballador.getAdreça());
	}

	public Treballador() {
	}

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}

	public String getAdreça() {
		return adreça;
	}

	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}

	public void obtenirAdreçes() {

		System.out.println("Adreça de treball: " + this.getAdreça() + " i adreça d' on viu: " + super.getAdreça());

	}
	
	public void Visualitzar() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Treballador [numSS=" + numSS + ", adreça=" + adreça + ", getNom()=" + getNom() + "]";
	}
	
	

}
