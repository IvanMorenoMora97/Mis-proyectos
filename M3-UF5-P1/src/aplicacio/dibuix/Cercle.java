package aplicacio.dibuix;

final class Cercle extends Figura {

	private int radi;

	public Cercle(String color, int x, int y, int linia, int radi) {
		super(color, x, y, linia);
		this.radi = radi;
	}
	
	public Cercle() {}

	@Override
	public void dibuixar() {

		System.out.println("S'ha dibuixat el cercle");
	}

	public void setRadi(int r) {
		
		this.radi = r;
		
	}

}
