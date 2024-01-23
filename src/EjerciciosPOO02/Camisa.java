package EjerciciosPOO02;

import java.util.Arrays;

public class Camisa {

	private long id;
	private String color;
	private int talla;
	private double precio;
	private Boton[] botonesCamisa;
	
	
	// constructor
	public Camisa(long id, String color, int talla, double precio, Boton[] botonesCamisa) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botonesCamisa = botonesCamisa;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getTalla() {
		return talla;
	}


	public void setTalla(int talla) {
		this.talla = talla;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Boton[] getBotonesCamisa() {
		return botonesCamisa;
	}


	public void setBotonesCamisa(Boton[] botonesCamisa) {
		this.botonesCamisa = botonesCamisa;
	}


	@Override
	public String toString() {
		return "Camisa [id=" + id + ", color=" + color + ", talla=" + talla + ", precio=" + precio + ", botonesCamisa="
				+ Arrays.toString(botonesCamisa) + "]";
	}
	
	
}
