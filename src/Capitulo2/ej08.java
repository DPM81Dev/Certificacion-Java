package Capitulo2;

public class ej08 {

//	Escribe un programa que declare 5 variables de tipo char. A continuación, crea
//	otra variable como cadena de caracteres y asígnale como valor la concatena-
//	ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
//	por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
	
	public static void main(String[] args) {
	    char l1 = 's';
	    char l2 = 'a';
	    char l3 = 'l';
	    char l4 = 'u';
	    char l5 = 'd';
	    
	    // La siguiente línea da error porque el resultado de sumar variables
	    // de tipo carácter es un número entero.
	    // String palabra = l1 + l2 + l3 + l4 + l5;
	    
	    // Se soluciona concatenando al principio la cadena un campop vacio.
	    String palabra = "" + l1 + l2 + l3 + l4 + l5;
	    
	    System.out.println("Solución I - Se soluciona concatenando al principio la cadena un campop vacio. \n------------------------------");
	    System.out.println(palabra);
	    
	    // Se soluciona concatenando entre cada una de las variables, una cadena vacia.
	    System.out.println(); // linea en blanco
	    System.out.println("Solución II - Se soluciona concatenando entre cada una de las variables, una cadena vacia \n------------------------------");
	    System.out.println(l1 + "" + l2 + "" + l3 + "" + l4 + "" + l5  );
	}
	
}
