package centre.educatiu;

final class Professor extends Treballador {

	private String titulaci�;
	private String especialitat;

	public Professor(Treballador treballador, String titulaci�, String especialitat) {

		this.setNumSS(treballador.getNumSS());
		this.setAdre�a(treballador.getAdre�a());
		this.titulaci� = titulaci�;
		this.especialitat = especialitat;

	}
	
	public Professor() {}

	public String getTitulaci�() {
		return titulaci�;
	}

	public void setTitulaci�(String titulaci�) {
		this.titulaci� = titulaci�;
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
		return "Professor [titulaci�=" + titulaci� + ", especialitat=" + especialitat + ", getNumSS()=" + getNumSS()
				+ ", getAdre�a()=" + getAdre�a() + ", getNom()=" + getNom() + "]";
	}

}
