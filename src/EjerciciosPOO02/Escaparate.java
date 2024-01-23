package EjerciciosPOO02;

public class Escaparate {

	public static void main(String[] args) {

		Boton boton1 = new Boton(1,"cuadrado","negro",2);
		Boton boton2 = new Boton(2,"redondo","amarillos",3);
		Boton boton3 = new Boton(3,"redondo","naranja",3);
		Boton[] botonesCamisa = {boton1, boton3};
		
		Pantalon pantalon1 = new Pantalon(1,"Negro",45,20.15,boton2);
		Camisa camisa1 = new Camisa(1,"Blanco",42, 25,botonesCamisa);
		Vestido vestido1 = new Vestido(1,"Rojo",40, 120);
		
		Maniqui maniqui1 = new Maniqui(1);
		maniqui1.vestir(vestido1);
		Maniqui	maniqui2 = new Maniqui(2,vestido1);
		maniqui2.vestir(camisa1,pantalon1);

		Escaparate miEscaparate = new Escaparate();
		
	}

}
