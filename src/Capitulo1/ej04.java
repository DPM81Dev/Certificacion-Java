package Capitulo1;

public class ej04 {

	public static void main(String[] args) {
		
		// SALIDA FORMATEADA DE LOS DATOS
		
		/* En esta instruccion pasamos dos elementos:
		 * por un lado el texto entrecomillado
		 */
		
		System.out.printf("El número %d no tiene decimales.\n", 21);
		System.out.printf("El número %f sale con decimales.\n", 21.0);
		System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0); // se puede variar los decimales en base al numero indicado %,2f.
	}

}
