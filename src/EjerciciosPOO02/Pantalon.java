package EjerciciosPOO02;

public class Pantalon {

	private long id;
	private String color;
	private int talla;
	private double precio;
	private Boton botonPantalon;
	
	//constructor
	
	public Pantalon(long id, String color, int talla, double precio, Boton botonPantalon) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botonPantalon = botonPantalon;
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

	public Boton getBotonPantalon() {
		return botonPantalon;
	}

	public void setBotonPantalon(Boton botonPantalon) {
		this.botonPantalon = botonPantalon;
	}

	@Override
	public String toString() {
		return "Pantalon [id=" + id + ", color=" + color + ", talla=" + talla + ", precio=" + precio
				+ ", botonPantalon=" + botonPantalon + "]";
	}
	
}
