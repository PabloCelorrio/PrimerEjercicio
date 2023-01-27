package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertarBorrar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] modulo = {"Programacion", "Entornos", "Bases de datos", "Lenguajes", "Sistemas", "FOL"};
		
		System.out.println("ELIJA UNA OPCION:");
		System.out.println("1. Insertar módulo");
		System.out.println("2. Borrar módulo");
		System.out.println("0. Salir");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		
		case 1:
			
			System.out.println("Escribe el módulo que vas a insertar:");
			String opmod = sc.nextLine();
			
			String[] modulo2 = Arrays.copyOf(modulo, modulo.length);
			
			modulo2[(modulo.length + 1)] = opmod;
			
			modulo = modulo2;
			
			break;
			
		case 2:
			
			System.out.println("Escribe el módulo que vas a borrar:");
			String opmod2 = sc.next();
			
			int pos = Arrays.binarySearch(modulo, opmod2);
			
			String[] modulo3 = new String[modulo.length - 1];
			
			for (int i = 0; i < pos; i++) {
				
				modulo3[i] = modulo[i];
				
			}
			
			for (int i = modulo.length; pos < i; i--) {
				
				modulo3[i] = modulo[i];
				
			}
			
			modulo = modulo3;
			
			break;
			
		case 0:
			
			break;
		
		}

		sc.close();
		
	}

}
