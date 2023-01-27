package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopiar {

	public static void main(String[] args) {

		int[] numeros = {3, 10, 5, 7, 14, 20, 83};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una posición inicial y una posición final");
		int posini = sc.nextInt();
		int posfinal = sc.nextInt();
		
		int [] numeroscopia = Arrays.copyOfRange(numeros, posini, posfinal);
		
		System.out.println(Arrays.toString(numeroscopia));
		
		int[] numeroscopia2 = Arrays.copyOf(numeros, numeros.length);
		
		if (numeros.equals(numeroscopia)) {
			
			System.out.println("Numeros y numeroscopia son iguales");
			
		}
		else {
			
			System.out.println("Numeros y numeroscopia son distintos");
			
		}
		
		System.out.println("Numeros y numeroscopia2 son iguales");
		
		System.out.println("Dame un número:");
		int num = sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeroscopia2[i] = num;
			
		}
		
		System.out.println(Arrays.toString(numeroscopia2));
		sc.close();
	}

}
