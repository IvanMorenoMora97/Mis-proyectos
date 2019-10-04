package aplicacio.dibuix;

public abstract class Figura {

	private String color;
	private int posicioX;
	private int posicioY;
	private int gruixLinia;

	public Figura(String color, int x, int y, int linia) {

		this.color = color;
		this.posicioX = x;
		this.posicioY = y;
		this.gruixLinia = linia;

	}

	public Figura() {
	}

	public void ubicar(int x, int y) {

		this.posicioX = x;
		this.posicioY = y;

	}

	public abstract void dibuixar();

	public void setColor(String c) {

		this.color = c;

	}

	public void setGruix(int g) {

		this.gruixLinia = g;
	}

}
