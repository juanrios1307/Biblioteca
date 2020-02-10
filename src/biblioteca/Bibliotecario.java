package biblioteca;

import modelo.DAO;

public class Bibliotecario {
	
	private DAO dao=new DAO();
	
	 public boolean addBoleta(Boleta b) {
	    return dao.addBoleta(b);	
	 } 
	 public Libro buscarLibro(int isbn) {
		 return dao.buscarLibro(isbn);
	 }
	 public boolean prestarLibro(int isbn,int cedula) {
		 return dao.prestarLibro(isbn,cedula);
	 }
	 public boolean devolverLibro(int isbn,int cedula) {
		 return dao.devolverLibro(isbn,cedula);
	 }

}
