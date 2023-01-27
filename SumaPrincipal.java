package Ejercicios;

public class SumaPrincipal {

	public static void main(String[] args) {

		if (args.length == 0) {
			
			System.out.println("No hay sumandos");
			
		}
		else {
			
			int suma = 0;
			
			for (int i = 0; i < args.length; i++) {
				
				suma = suma + Integer.parseInt(args[i]);
				
			}
			
			System.out.println("La suma es: " + suma);
			
		}
		
	}

}
