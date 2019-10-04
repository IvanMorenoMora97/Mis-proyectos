package centre.educatiu;

public class Estudiant extends Persona {

	private String dataAlta;
	private int edat;
	private String nif;

	public Estudiant(String nom, String adre�a, String dataAlta, int edat, String nif) {

		super(nom, adre�a);
		this.dataAlta = dataAlta;
		this.edat = edat;
		this.nif = nif;

	}

	public Estudiant(Persona persona, String dataAlta, int edat, String nif) {

		this.setNom(persona.getNom());
		this.setAdre�a(persona.getAdre�a());
		this.dataAlta = dataAlta;
		this.edat = edat;
		this.nif = nif;

	}
	
	public Estudiant() {}

	public String getDataAlta() {
		return dataAlta;
	}

	public void setDataAlta(String dataAlta) {
		this.dataAlta = dataAlta;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public void Visualitzar() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Estudiant [dataAlta=" + dataAlta + ", edat=" + edat + ", nif=" + nif + ", getNom()=" + getNom()
				+ ", getAdre�a()=" + getAdre�a() + "]";
	}

	

	
	
	
	
	

}
