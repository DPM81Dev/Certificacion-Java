package EjerciciosPOO01;

import java.util.Arrays;

public class Ferreteria {

	private int id;
	private String nombre;
	private String direccion;
	private Tornillo[] tornillo;

	// constructor

	public Ferreteria(int id, String nombre, String direccion, Tornillo[] tornillo) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tornillo = tornillo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Tornillo[] getTornillo() {
		return tornillo;
	}

	public void setTornillo(Tornillo[] tornillo) {
		this.tornillo = tornillo;
	}

	@Override
	public String toString() {
		return "Ferreteria [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", tornillo="
				+ Arrays.toString(tornillo) + "]";
	}

}
