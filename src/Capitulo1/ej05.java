package Capitulo1;

public class ej05 {

	public static void main(String[] args) {
/*Escribe un programa que pinte por pantalla una pirámide rellena a base de
asteriscos. La base de la pirámide debe estar formada por 9 asteriscos
*/

		// declaramos la altura de un arbol de navidad
		int altura = 4;
		// blucle para recorrer todas las filas del arbol (altura)
		for (int fila = 0; fila < altura; fila++) {

		// bublce para los espacios
		
		for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
			System.out.print(" ");
			}
		// bucle para los asteriscos
		for (int asterisco = 0; asterisco <(fila*2)+1; asterisco++) {
			System.out.print("*");
			}
		
		System.out.println("");
		
		}
	}
}
