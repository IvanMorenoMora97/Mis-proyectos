package centre.educatiu;

final class PersonalGesti� extends Treballador {

	private String posici�;

	public PersonalGesti�(Treballador treballador, String posici�) {

		this.setNumSS(treballador.getNumSS());
		this.setAdre�a(treballador.getAdre�a());
		this.posici� = posici�;

	}
	
	public PersonalGesti�(PersonalGesti� personalgesti�) {
		
		this.setNumSS(personalgesti�.getNumSS());
		this.setAdre�a(personalgesti�.getAdre�a());
		this.setPosici�(personalgesti�.getPosici�());

	}
	
	public PersonalGesti�() {}

	public String getPosici�() {
		return posici�;
	}

	public void setPosici�(String posici�) {
		this.posici� = posici�;
	}
	
	public void Visualitzar() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "PersonalGesti� [posici�=" + posici� + ", getNumSS()=" + getNumSS() + ", getAdre�a()=" + getAdre�a()
				+ ", getNom()=" + getNom() + "]";
	}

	

}
