package EjerciciosPOO01;

public class Vendedor {

	public static void main(String[] args) {

		// creo los objetos introduciendo los valores manualmente.

		Tornillo tor1 = new Tornillo(1, "negro", 1.00, 2.90, 4.00);
		Tornillo tor2 = new Tornillo(2, "amarillo", 3.00, 1.90, 44.40);
		Tornillo tor3 = new Tornillo(3, "rojo", 2.00, 1.90, 1.60);

		// creo el array de tornillos.

		Tornillo[] cajaTornillos = { tor1, tor2, tor3 };

		// creo la ferreteria.

		Ferreteria ferre = new Ferreteria(1, "Ferreteria_mia", "Cerca de mi casa num 2", cajaTornillos);

		System.out.println(ferre);
		 
		// sumamos precio de los tornillos
		double contador = 0; // creamos contador para realizar el for each.
		
		for (Tornillo tornillo : cajaTornillos) {
			contador += tornillo.getPrecio(); // se guarda el valor solicitado tornillo.getPrecio dentro de la variable contador
			//contador = contador + tornillo.getPrecio
		}
		
		System.out.println(contador);
	}
}
