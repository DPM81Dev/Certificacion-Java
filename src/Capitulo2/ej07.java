package Capitulo2;

public class ej07 {
	
//	Escribe un programa que declare variables de tipo char y de tipo String. Intenta
//	mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
//	de Java (con un solo println) ¿es posible?
	
	public static void main(String[] args) {
	
	    char primeraLetra = 'a';
	    char ultimaLetra = 'z';
	    String palabra = "abecedario";
	    
	    //formateamos la salida del resultado
	    System.out.println(primeraLetra + "" + ultimaLetra + " " + palabra);
		
	}
}
