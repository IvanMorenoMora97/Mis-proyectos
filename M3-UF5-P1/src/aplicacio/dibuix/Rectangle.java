package aplicacio.dibuix;

final class Rectangle extends Figura {

	private int costatVertical;

	private int costatHoritzontal;

	public Rectangle(String color, int x, int y, int linia, int costatVertical, int costatHoritzontal) {
		super(color, x, y, linia);
		this.costatVertical = costatVertical;
		this.costatHoritzontal = costatHoritzontal;
	}
	
	public Rectangle() {}

	@Override
	public void dibuixar() {

		System.out.println("S'ha dibuixat el rectangle");

	}

	public void setCostatV(int c) {
		
		this.costatVertical = c;
		
	}

	public void setCostatH(int c) {
		
		this.costatHoritzontal = c;
		
	}

}
