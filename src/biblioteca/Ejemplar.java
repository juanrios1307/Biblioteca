package biblioteca;

public class Ejemplar {
	private Libro libro;
	private String codigoEjemplar;
	private boolean disponible;
	
	public Ejemplar(Libro libro, String codigoEjemplar, boolean disponible) {
		this.libro = libro;
		this.codigoEjemplar = codigoEjemplar;
		this.disponible = disponible;
	}
	
	
}
