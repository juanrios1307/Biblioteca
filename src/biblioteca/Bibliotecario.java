package biblioteca;

public class Bibliotecario {
	
	private Libro[] libros;
	private Boleta[] boletasActuales;
	private Boleta[] boletasInactivas;
	
	public Bibliotecario(Libro[] libros, Boleta[] boletasActuales, Boleta[] boletasInactivas) {
		this.libros = libros;
		this.boletasActuales = boletasActuales;
		this.boletasInactivas = boletasInactivas;
	}

	private boolean prestamo(String nombreUsuario, String cedula, String nombreLibro) {
		return true;
	}
	
	private boolean devolucion(String codigoEjemplar) {
		return true;
	}
	
}
