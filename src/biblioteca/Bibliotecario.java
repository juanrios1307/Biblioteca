package biblioteca;

import modelo.DAO;

public class Bibliotecario {
	
	DAO dao=new DAO();
	
	 public boolean addBoleta(Boleta b) {
	    return dao.addBoleta(b);	
	 } 
	 public Libro buscarLibro(String isbn) {
		 return dao.buscarLibro(isbn);
	 }
	 public boolean prestarLibro(String isbn,String cedula) {
		 return dao.prestarLibro(isbn,cedula);
	 }
	 public boolean devolverLibro(String isbn,String cedula) {
		 return dao.devolverLibro(isbn,cedula);
	 }

}
