package EjerciciosPOO02;

public class Boton {
	
	private long id;
	private String forma;
	private String color;
	private int tamanio;


	// constructor 
	public Boton(long id, String forma, String color, int tamanio) {
		super();
		this.id = id;
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getTamanio() {
		return tamanio;
	}


	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}


	@Override
	public String toString() {
		return "Boton [id=" + id + ", forma=" + forma + ", color=" + color + ", tamanio=" + tamanio + "]";
	}
	
	
	
}
