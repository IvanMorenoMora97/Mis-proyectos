package centre.educatiu;

final class Professor extends Treballador {

	private String titulació;
	private String especialitat;

	public Professor(Treballador treballador, String titulació, String especialitat) {

		this.setNumSS(treballador.getNumSS());
		this.setAdreça(treballador.getAdreça());
		this.titulació = titulació;
		this.especialitat = especialitat;

	}
	
	public Professor() {}

	public String getTitulació() {
		return titulació;
	}

	public void setTitulació(String titulació) {
		this.titulació = titulació;
	}

	public String getEspecialitat() {
		return especialitat;
	}

	public void setEspecialitat(String especialitat) {
		this.especialitat = especialitat;
	}
	
	public void Visualitzar() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Professor [titulació=" + titulació + ", especialitat=" + especialitat + ", getNumSS()=" + getNumSS()
				+ ", getAdreça()=" + getAdreça() + ", getNom()=" + getNom() + "]";
	}

}
