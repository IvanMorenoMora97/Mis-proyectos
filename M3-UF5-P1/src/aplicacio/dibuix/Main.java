package aplicacio.dibuix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// COMPROBACIÓ DE LA CLASE CERCLE

		Cercle circulo = new Cercle();

		circulo.setRadi(3);

		circulo.dibuixar();

		Cercle circulo2 = new Cercle("rojo", 10, 5, 3, 8);

		circulo2.dibuixar();

		// COMPROBACIÓ DE LA CLASE RECTANGLE

		Rectangle rectangulo = new Rectangle();

		rectangulo.setCostatV(12);

		rectangulo.setCostatH(2);

		rectangulo.dibuixar();

		Rectangle rectangulo2 = new Rectangle("negro", 32, 3, 7, 6, 9);

		rectangulo2.dibuixar();

		// COMPROBACIÓ DE LA CLASE TRIANGLE

		Triangle triangulo = new Triangle();

		triangulo.setAltura(12);

		triangulo.setBase(3);

		triangulo.dibuixar();

		Triangle triangulo2 = new Triangle("verde", 2, 3, 7, 15, 3);

		triangulo2.dibuixar();
		
		dibuixarFigura(circulo);

		reader.close();
	}
	
	private static void dibuixarFigura(Figura f) {
		
		if(f instanceof Cercle) {
			
			f.dibuixar(); 	//UTILITZA EL METODE DIBUIXAR DE CERCLE
			
		}
		
		if(f instanceof Rectangle) {
			
			f.dibuixar();	//UTILITZA EL METODE DIBUIXAR DE RECTANGLE
			
		}
		
		if(f instanceof Triangle) {
			
			f.dibuixar();		//UTILITZA EL METODE DIBUIXAR DE TRIANGLE
			
		}
		
		
	}

}
