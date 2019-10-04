package centre.educatiu;

final class Intercanvi extends Estudiant {

	private String paisOrigen;

	public Intercanvi(Estudiant estudiant, String paisOrigen) {

		this.setDataAlta(estudiant.getDataAlta());
		this.setEdat(estudiant.getEdat());
		this.setNif(estudiant.getNif());
		this.paisOrigen = paisOrigen;

	}

	public Intercanvi() {
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public void Visualitzar() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Intercanvi [paisOrigen=" + paisOrigen + ", getDataAlta()=" + getDataAlta() + ", getEdat()=" + getEdat()
				+ ", getNif()=" + getNif() + ", getNom()=" + getNom() + ", getAdreça()=" + getAdreça() + "]";
	}

}
