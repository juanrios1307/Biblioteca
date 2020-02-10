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
	 public Boleta buscarBoleta(int codBoleta) {
		 return dao.buscarBoleta(codBoleta);
	 }
	 public boolean prestarLibro(int isbn,int codigoBoleta) {
		 return dao.prestarLibro(isbn,codigoBoleta);
	 }
	 public boolean devolverLibro(int isbn,int codigoBoleta) {
		 return dao.devolverLibro(isbn,codigoBoleta);
	 }

}
