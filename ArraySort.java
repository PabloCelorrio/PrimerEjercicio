package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Inserta un número: ");
			numeros[i] = sc.nextDouble();
			
		}
		
		Arrays.sort(numeros);
		
		boolean igual = false;
		
		for (int i = 0; i < numeros.length && !igual; i++) {
		
			
				if (numeros[i] == numeros[i+1]) {
				
					System.out.println("Hay numeros que son iguales.");
					igual = true;
				
			
			}
		}
		sc.close();
	}
		

}
