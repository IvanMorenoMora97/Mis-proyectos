package centre.educatiu;

final class PersonalGestió extends Treballador {

	private String posició;

	public PersonalGestió(Treballador treballador, String posició) {

		this.setNumSS(treballador.getNumSS());
		this.setAdreça(treballador.getAdreça());
		this.posició = posició;

	}
	
	public PersonalGestió(PersonalGestió personalgestió) {
		
		this.setNumSS(personalgestió.getNumSS());
		this.setAdreça(personalgestió.getAdreça());
		this.setPosició(personalgestió.getPosició());

	}
	
	public PersonalGestió() {}

	public String getPosició() {
		return posició;
	}

	public void setPosició(String posició) {
		this.posició = posició;
	}
	
	public void Visualitzar() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "PersonalGestió [posició=" + posició + ", getNumSS()=" + getNumSS() + ", getAdreça()=" + getAdreça()
				+ ", getNom()=" + getNom() + "]";
	}

	

}
