package EjerciciosPOO02;

public class Maniqui {
	
	private long id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	
	
	public Maniqui(long id) {
		super();
		this.id = id;
	}
	
	public Maniqui(long id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Vestido getVestido() {
		return vestido;
	}


	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}


	public Pantalon getPantalon() {
		return pantalon;
	}


	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}


	public Camisa getCamisa() {
		return camisa;
	}


	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}


	@Override
	public String toString() {
		return "Maniqui [id=" + id + ", vestido=" + vestido + ", pantalon=" + pantalon + ", camisa=" + camisa + "]";
	}
	
	public void desvestir() {
		this.camisa = null;
		this.pantalon = null;
		this.vestido = null;
		
	}
	
	public void vestir(Vestido vestido) {
		this.desvestir();
		this.vestido = vestido;
	}
	
	
	public void vestir(Camisa camisa, Pantalon pantalon) {
		this.desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;		
	}
}
