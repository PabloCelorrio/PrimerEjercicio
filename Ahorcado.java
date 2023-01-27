package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		char[] palabraSecreta = {'e', 's', 't', 'e', 'r', 'n', 'o', 'c', 'l', 'e', 'i', 'd', 'o', 'm', 'a', 's', 't', 'o', 'i', 'd', 'e', 'o'};
		
		char[] palabra = new char[palabraSecreta.length];
		
		char[][] pantalla = new char[5][5];
		
		int intentos = 9; 
		
		inicializaJuego(palabra, pantalla, intentos);
			
		buscarLetra(palabraSecreta, palabra, intentos, pantalla);
			

			
		}
	
	
	private static void inicializaJuego(char[] palabra, char[][] pantalla, int intentos) {
		
		for(int i = 0; i < palabra.length; i++) {
			
			palabra[i] = '_';
			
		}
		
		for(int i = 0; i < pantalla.length; i++) {
			
			for(int j = 0; j < pantalla[i].length; j++) {
				
				pantalla[i][j] = '0';
				
			}
		}
		
		dibujoAhorcado(palabra, pantalla, intentos);
		
	}
	
	public static void mostrar(char[] palabra, char[][] pantalla) {
		
		System.out.println(Arrays.toString(palabra));
		
		for(int i = 0; i < pantalla.length; i++ ) {
			
			for(int j = 0; j < pantalla[i].length; j++) {
				
				System.out.print(pantalla[i][j]);
				
			}
			System.out.println(" ");
		}
		
	}
	
	public static void dibujoAhorcado(char[] palabra, char[][] pantalla, int intentos) {
		
		switch(intentos) {
		
		case 9:
			
			for(int i = 0; i < pantalla.length; i++) {
				
				for(int j = 0; j < pantalla[i].length; j++) {
					
					pantalla[i][j] = 0;
					
				}
				
			}
			
			mostrar(palabra, pantalla);
			
			break;

		case 8:
			
			pantalla[4][1] = '@';
			pantalla[4][2] = '@';
			pantalla[4][3] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 7:
			
			pantalla[3][1] = '@';
			pantalla[2][1] = '@';
			pantalla[1][1] = '@';
			pantalla[0][1] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 6:
			
			pantalla[0][2] = '@';
			pantalla[0][3] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 5:
			
			pantalla[1][3] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 4:
			
			pantalla[2][3] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 3:
			
			pantalla[1][2] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 2:
			
			pantalla[1][4] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 1:
			
			pantalla[3][2] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
			
		case 0:
			
			pantalla[3][4] = '@';
			
			mostrar(palabra, pantalla);
			
			break;
		
		}
		
	}
	
	private static void buscarLetra(char[] palabraSecreta, char[] palabra, int intentos, char[][] pantalla) {
		
		Scanner sc = new Scanner(System.in);
		
		while (intentos >= 0 || Arrays.equals(palabra, palabraSecreta) == true) {
			
			System.out.println("Inserte una letra: ");
			char letra = sc.next().charAt(0);
			
		
			for(int i = 0; i < palabraSecreta.length; i++) {
			
				if (letra == palabraSecreta[i]) {
				
					palabra[i] = letra;
				
				}
			
				else {
				
					if (i == palabraSecreta.length) {
					
						intentos--;
					
					}
				
				}
		
			}
			
			dibujoAhorcado(palabra, pantalla, intentos);
		}

		
		
	}


}
