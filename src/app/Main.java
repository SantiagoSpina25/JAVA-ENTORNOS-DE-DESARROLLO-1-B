package app;

import modelos.Circulo;
import modelos.Rectangulo;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(4);
		Circulo c3 = new Circulo(12);
		
		System.out.println(c1.getArea());
		System.out.println(c3.getPerimetro());
		
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,4);
		
		System.out.println(r1.getAltura());
		System.out.println(r2.getPerimetro());
		
		
		
	}
	
	
	
}
