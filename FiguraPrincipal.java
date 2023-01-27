package Ejercicios;

import java.util.Scanner;

public class FiguraPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ELIJA UNA OPCION:");
		System.out.println("1. CUADRADO");
		System.out.println("2. TRIANGULO");
		System.out.println("0. SALIR");
		
		int opcion = sc.nextInt();

		switch(opcion) {
		
		case 1:
		
			System.out.println("Inserte el tamaño del lado del cuadrado:");
			double lado = sc.nextDouble();
			
			System.out.println("Que color tiene el cuadrado ? : ");
			String colorc = sc.next();
			
			Cuadrado cd = new Cuadrado(lado, colorc);
			
			System.out.println("El área del cuadrado es: " + cd.calcularArea());
			System.out.println("Su color es: "+ cd.getColor());
			
			break;
			
		case 2:
			
			System.out.println("Inserte el tamaño de la altura del triangulo:");
			double altura = sc.nextDouble();
			
			System.out.println("Inserte el tamaño de la base del triangulo: ");
			double base = sc.nextDouble();
			
			System.out.println("Que color tiene el triangulo ? : ");
			String colort = sc.next();
			
			Triangulo tg = new Triangulo(base, altura, colort);
			
			System.out.println("El área del triángulo es: " + tg.calcularArea());
			System.out.println("Su color es: "+ tg.getColor());
			
			break;
			
		case 0:
			
			System.out.println("FIN DE PROGRAMA.");
			break;
		
		}

		sc.close();
	}

}
