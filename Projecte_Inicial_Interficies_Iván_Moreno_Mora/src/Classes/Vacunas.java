package Classes;

public class Vacunas {

	private String nom;
	private int CLcubicos;
	private String nomcientific;
	private String distribuidor;

	// CONSTRUCTOR

	public Vacunas(String nom, String NCientific, int CLcubicos, String distribuidor) {

		this.nom = nom;
		this.nomcientific = NCientific;
		this.CLcubicos = CLcubicos;
		this.distribuidor = distribuidor;

	}

	// METODES
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMcubicos() {
		return CLcubicos;
	}

	public void setMcubicos(int mcubicos) {
		this.CLcubicos = mcubicos;
	}

	public String getNomcientific() {
		return nomcientific;
	}

	public void setNomcientific(String nomcientific) {
		this.nomcientific = nomcientific;
	}

	public String getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}

	public void visualitzar() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Vacunas [nom=" + nom + ", CLcubicos=" + CLcubicos + ", nomcientific=" + nomcientific + ", distribuidor="
				+ distribuidor + "]";
	}

}
