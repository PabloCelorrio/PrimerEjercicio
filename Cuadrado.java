package Ejercicios;

public class Cuadrado extends Figura {
	
	private double lado;

	public Cuadrado() {
	
	}
	
	public Cuadrado(double lado, String color) {
		
		super(color);
		this.lado = lado;
		
	}

	@Override
	public double calcularArea() {

		double area = lado * lado;
		return area;
		
	}
		

}
