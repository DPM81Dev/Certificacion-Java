package Capitulo2;

public class ej05 {

	//Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
	// convertir deberá estar almacenada en una variable.
	
	public static void main(String[] args) {
		

    int pesetas = 10000;
    double euros = pesetas / 166.386;
    

    System.out.println(pesetas + " pesetas son " + euros + " euros.");
    
    // formateamos la salida del resultado
    // Para mostrar dos decimales se puede usar "printf"
    // en lugar de "print" o "println"
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
    
	}
}
