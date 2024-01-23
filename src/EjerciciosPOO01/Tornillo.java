package EjerciciosPOO01;

public class Tornillo {

	private int id;
	private String color;
	private double longitud;
	private double diametro;
	private double precio;

	// constructor

	public Tornillo(int id, String color, double longitud, double diametro, double precio) {
		this.id = id;
		this.color = color;
		this.longitud = longitud;
		this.diametro = diametro;
		this.precio = precio;
	}

	// Getter and Setter, eliminamos los SET de los metodos importantes de las
	// variables que deben ser unicos.

	public int getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tornillo [id=" + id + ", color=" + color + ", longitud=" + longitud + ", diametro=" + diametro
				+ ", precio=" + precio + "]";
	}

}
