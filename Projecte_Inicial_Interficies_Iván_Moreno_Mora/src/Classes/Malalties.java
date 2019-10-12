package Classes;

public class Malalties implements Comparable<Malalties>, Cloneable {

	private String TipusTransmissió;
	private int morts;
	private int infecció;
	private String TipusMalaltia;
	private String nomMalaltia;
	private String paisos;
	private int id;

	// COMPARADOR QUE ORDENA LA LISTA POR NOMBRE

	@Override
	public int compareTo(Malalties n) {

		return this.nomMalaltia.compareTo(n.nomMalaltia);
	}

	// CLONADOR

	@Override
	public Malalties clone() {

		Malalties novaMalaltia;

		try {
			
			novaMalaltia = (Malalties) super.clone();
				
			return novaMalaltia;

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
			return null;

		}

	}

	// CONSTRUCTORS

	public Malalties(String tipusTransmisio, int morts, int infecció, String tipusMalaltia, String nomMalaltia,
			String paisos, int id) {
		this.TipusTransmissió = tipusTransmisio;
		this.morts = morts;
		this.infecció = infecció;
		this.TipusMalaltia = tipusMalaltia;
		this.nomMalaltia = nomMalaltia;
		this.paisos = paisos;
		this.id = id;
	}

	public Malalties() {
	}

	// METODES
	public String getNomMalaltia() {
		return nomMalaltia;
	}

	public void setNomMalaltia(String nomMalaltia) {
		this.nomMalaltia = nomMalaltia;
	}

	public String getTipusTransmisio() {
		return TipusTransmissió;
	}

	public void setTipusTransmisio(String tipusTransmisio) {
		TipusTransmissió = tipusTransmisio;
	}

	public int getMorts() {
		return morts;
	}

	public void setMorts(int morts) {
		this.morts = morts;
	}

	public int getInfecció() {
		return infecció;
	}

	public void setInfecció(int infecció) {
		this.infecció = infecció;
	}

	public String getTipusMalaltia() {
		return TipusMalaltia;
	}

	public void setTipusMalaltia(String tipusMalaltia) {
		TipusMalaltia = tipusMalaltia;
	}

	public String getPaisos() {
		return paisos;
	}

	public void setPaisos(String paisos) {
		this.paisos = paisos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void visualitzar() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "\nMalalties [TipusTransmisio=" + TipusTransmissió + ", morts=" + morts + ", infecció=" + infecció
				+ ", TipusMalaltia=" + TipusMalaltia + ", nomMalaltia=" + nomMalaltia + ", paisos=" + paisos + ", id="
				+ id + "]";
	}

}
