package aplicacio.dibuix;

final class Triangle extends Figura {

	private int altura;

	private int base;

	public Triangle(String color, int x, int y, int linia, int altura, int base) {
		super(color, x, y, linia);
		this.altura = altura;
		this.base = base;
	}
	
	public Triangle() {}

	@Override
	public void dibuixar() {

		System.out.println("S'ha dibuixat el triangle");

	}

	public void setAltura(int h) {
		
		this.altura = h;
		
	}

	public void setBase(int b) {
		
		this.base = b;
		
	}

}
