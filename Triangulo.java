package Ejercicios;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;

	public Triangulo() {

	}
	
	public Triangulo(double base, double altura, String color) {
		
		super(color);
		this.base = base;
		this.altura = altura;

	}
	
	@Override
	public double calcularArea() {
		
		double area = (base*altura)/2;
		
		return area;
		
	}

}
