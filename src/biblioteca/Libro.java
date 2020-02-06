package biblioteca;

import java.util.ArrayList;

public class Libro {
	private String nombre;
	private String autor;
	private String codigo; //ISBN
	private String edicion;	
	private Ejemplar[] ejemplar;
	
	public Libro(String nombre, String autor, String codigo, String edicion, Ejemplar[] ejemplar) {
		this.nombre = nombre;
		this.autor = autor;
		this.codigo = codigo;
		this.edicion = edicion;
		this.ejemplar = ejemplar;
	}
	
	
	
}
