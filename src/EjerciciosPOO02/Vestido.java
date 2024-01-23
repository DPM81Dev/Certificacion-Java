package EjerciciosPOO02;

public class Vestido {

	private long id;
	private String color;
	private int talla;
	private double precio;
	
	//constructor
	public Vestido(long id, String color, int talla, double precio) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
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

	@Override
	public String toString() {
		return "Vestido [id=" + id + ", color=" + color + ", talla=" + talla + ", precio=" + precio + "]";
	}
	
}
