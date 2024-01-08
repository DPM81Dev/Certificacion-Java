package Capitulo2;

public class ej01 {
	public static void main(String[] args) {
		
		/*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
		 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
		 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
		*/
		
		// Variables.
		int x = 144 ;
		int y = 999 ;
		
		// Variables para operaciones.
		int suma = x+y;
		int resta = x-y;
		int division = x/y;
		int multiplicacion = x*y;
		
		// Operaciones 
		System.out.println("La suma de mis variables son " +x +" e " +y +" y suman: " + (suma)  );
		
		System.out.println("La division de mis variables son " +x +" e " +y +" y restan: " + (division)  );
		
		System.out.println("La resta de mis variables son " +x +" e " +y +" y restan: " + (resta)  );
		
		System.out.println("La multiplicacion de mis variables son " +x +" e " +y +" y restan: " + (multiplicacion)  );
	}

}
